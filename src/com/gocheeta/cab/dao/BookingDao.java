package com.gocheeta.cab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.gocheeta.cab.entities.Booking;
import com.gocheeta.cab.utils.CustomException;



public class BookingDao {
	
	
	public static List<Booking> getBooking(DataSource dataSource,String customerId){
		 
		List<Booking> bookings = new ArrayList<Booking>();
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rset  = null;
		String sql = null;
		
		try {
			con = dataSource.getConnection();
			sql= "SELECT  booking.booking_Id,booking.driver_Id,booking.customer_Id,booking.vehicle_category_Id, \r\n"
					+ "source_Location ,destinationation_Location,pickup_Time,drop_Time,booking_Status,booking_Date,\r\n"
					+ "(select street_Name from street where street_Id = source_Location) as source,\r\n"
					+ "(select street_Name from street where street_Id = destinationation_Location) as destinationation,\r\n"
					+ "\r\n"
					+ "city.city_Name,\r\n"
					+ "driver.driver_Name,driver.vehicle_No,driver.phone_No as driver_phone_No,\r\n"
					+ "vehicle_category.vehicle_type_Name,\r\n"
					+ "customer.customer_Name,customer.phone_No,customer.email,vehicle_category.service_Charge,vehicle_category.charge_per_Km,"
					+ " payment.charges_Calculated, payment.km_Covered  \r\n"
					+ "FROM booking \r\n"
					+ "INNER JOIN city on city.city_Id = booking.city_Id \r\n"
					+ "inner JOIN customer on booking.customer_Id=customer.customer_Id\r\n"
					+ "inner JOIN vehicle_category on booking.vehicle_category_Id=vehicle_category.vehicle_category_Id "
					+ " left JOIN payment on booking.booking_Id = payment.booking_Id\r\n"
					+ "left JOIN driver on booking.driver_Id=driver.driver_Id where booking.customer_Id=? ORDER BY booking_Date DESC";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customerId);
			rset= stmt.executeQuery();
			
			while(rset.next()) {
				String booking_Id = rset.getString(1);
				String driver_Id = rset.getString(2);
				String customer_Id = rset.getString(3);
				String vehicle_category_Id = rset.getString(4);
				String city_Id = "";
				String source_Location = rset.getString(5);
				String destinationation_Location = rset.getString(6);
				String pickup_Time = rset.getString(7);
				String drop_Time = rset.getString(8);
				String booking_Status = rset.getString(9);
			
				java.sql.Date booking_Date = rset.getDate(10);
				
				
			
				String source = rset.getString(11);
				String destinationation = rset.getString(12);
				String city_Name = rset.getString(13);
				String driver_Name = rset.getString(14);
				String vehicle_No = rset.getString(15);
				String driver_phone_No = rset.getString(16);
				String vehicle_type_Name = rset.getString(17);
				String customer_Name = rset.getString(18);
				String phone_No = rset.getString(19);
				String email = rset.getString(20);
				Double service_Charge = rset.getDouble(21);
				Double charge_per_Km = rset.getDouble(22);
				Double charges_Calculated = rset.getDouble(23);
				Double km_Covered = rset.getDouble(24);
				
				
				Booking booking = new Booking(booking_Id,driver_Id,customer_Id,source_Location,
						 destinationation_Location,pickup_Time,drop_Time,booking_Status,
						 vehicle_category_Id,booking_Date,city_Id,
						 source,destinationation,city_Name,driver_Name,vehicle_No,
						 driver_phone_No,vehicle_type_Name,customer_Name,phone_No,email,service_Charge,charge_per_Km,
						 charges_Calculated,km_Covered
						);
				bookings.add(booking);
				
			}	
			
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}finally {
			
			close(con,stmt,null);
		}
		
		return bookings;
	}
	
	public static int checkDriver(DataSource dataSource, String city_Id,String vehicle_category_Id) {
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rset  = null;
		String sql = null;
		int returnVal = 0;
		
		try {
			con = dataSource.getConnection();
			sql= "select * from driver WHERE driver_Id NOT IN (select driver_Id from booking WHERE "
					+ "booking_Status = 'Pending' or booking_Status = 'Confirmed' or booking_Status = 'PickedUp' or booking_Status = 'Dropped' "
					+ "AND city_Id=? ) and vehicle_category_Id =?;";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, city_Id);
			stmt.setString(2, vehicle_category_Id);
			rset= stmt.executeQuery();
			
			if(rset.next()) {
				returnVal = 1;
				
			}	
			else {
				returnVal = 0;
			}
			
			
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}finally {
			
			close(con,stmt,null);
		}
		
		return returnVal;
	}

	
	public static void addBooking(DataSource dataSource, Booking booking) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			
			con = dataSource.getConnection();
			sql= "INSERT INTO booking(booking_Id,driver_Id,customer_Id,source_Location,destinationation_Location,pickup_Time,drop_Time,booking_Status,vehicle_category_Id,booking_Date,city_Id)"
					+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, booking.getBookingId());
			pstmt.setString(2, booking.getDriverId());
			pstmt.setString(3, booking.getCustomerId());
			pstmt.setString(4, booking.getSourceLocation());
			pstmt.setString(5, booking.getDestinationationLocation());
			pstmt.setString(6, booking.getPickupTime());
			pstmt.setString(7, booking.getDropTime());
			pstmt.setString(8, booking.getBookingStatus());
			pstmt.setString(9, booking.getVehicleCategoryId());
			pstmt.setDate(10, booking.getBookingDate());
			pstmt.setString(11, booking.getCityId());
			pstmt.execute();
			
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}finally {
			
				close(con,pstmt,null);
		}
		
	}
	
	private static void close(Connection con,Statement stmt,ResultSet rset) {
		try {
			if(rset != null)
			{
				rset.close();
			}
			if(stmt != null)
			{
				stmt.close();
			}
			
			if(con != null)
			{
				con.close();
			}
			
		} catch (SQLException e) {
			throw new CustomException(e.getMessage());
		}
		
	}


}
