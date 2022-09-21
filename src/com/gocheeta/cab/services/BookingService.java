package com.gocheeta.cab.services;

import java.util.List;

import javax.sql.DataSource;

import com.gocheeta.cab.dao.BookingDao;
import com.gocheeta.cab.entities.Booking;




public class BookingService {
	
	public static List<Booking> getBooking(DataSource dataSource,String customerId){
			
			return BookingDao.getBooking(dataSource,customerId);
		}
	
	public static boolean checkDriver(DataSource dataSource, String city_Id,String vehicle_category_Id) {
		int driverAvailabilty ;
		
		driverAvailabilty =	BookingDao.checkDriver( dataSource,  city_Id, vehicle_category_Id);
		
		if(driverAvailabilty == 0) {
			
			return true ;
		}
		else {
			return false;
		}
	}
	
	public static void addBooking(DataSource dataSource, Booking booking) {
		BookingDao.addBooking(dataSource,booking);
		
	}

}
