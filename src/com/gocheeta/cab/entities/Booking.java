package com.gocheeta.cab.entities;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

public class Booking {
	
	private String bookingId ;
	
	private String driverId;
	
	private String customerId;
	
	@NotBlank(message = "is required")
	private String sourceLocation;
	
	@NotBlank(message = "is required")
	private String destinationationLocation;
	
	private String pickupTime;
	private String dropTime;
	
	@NotBlank(message = "is required")
	private String bookingStatus;
	
	@NotBlank(message = "is required")
	private String vehicleCategoryId;
	
	@NotBlank(message = "is required")
	private Date  bookingDate;
	
	@NotBlank(message = "is required")
	private String cityId;
	

	private String source;
	private String destinationation;
	private String cityName;
	private String driverName;
	private String vehicleNo;
	private String driverPhoneNo;
	private String vehicleType;
	private String customerName;
	private String phoneNo;
	private String email;
	
	private Double serviceCharge;
	
	private Double chargePerKm;
	
	private Double chargesCalculated;
	
	private Double kmCovered;
	
	public Booking(String booking_Id, String driver_Id, String customer_Id,String source_Location,
			String destinationation_Location, String pickup_Time, String drop_Time,String booking_Status,
			String vehicle_category_Id,Date booking_Date, String city_Id,
			String source, String destinationation, String city_Name, String driver_Name, String vehicle_No,
			String driver_phone_No, String vehicle_type_Name, String customer_Name, String phone_No, String email,Double service_Charge,
			Double charge_per_Km,Double charges_Calculated, Double km_Covered) {
	super();
	this.bookingId = booking_Id;
	this.driverId = driver_Id;
	this.customerId = customer_Id;
	this.sourceLocation = source_Location;
	this.destinationationLocation = destinationation_Location;
	this.pickupTime = pickup_Time;
	this.dropTime = drop_Time;
	this.bookingStatus = booking_Status;
	this.vehicleCategoryId = vehicle_category_Id;
	this.bookingDate = booking_Date;
	this.cityId = city_Id;
	this.source = source;
	this.destinationation = destinationation;
	this.cityName = city_Name;
	this.driverName = driver_Name;
	this.vehicleNo = vehicle_No;
	this.driverPhoneNo = driver_phone_No;
	this.vehicleType = vehicle_type_Name;
	this.customerName = customer_Name;
	this.phoneNo = phone_No;
	this.email = email;
	this.serviceCharge = service_Charge;
	this.chargePerKm = charge_per_Km;
	this.chargesCalculated = charges_Calculated;
	this.kmCovered = km_Covered;
}
	
	public Booking(String booking_Id, String driver_Id, String customer_Id,String source_Location,
			String destinationation_Location, String pickup_Time, String drop_Time,String booking_Status,
			String vehicle_category_Id,Date booking_Date, String city_Id,
			String source, String destinationation, String city_Name, String driver_Name, String vehicle_No,
			String driver_phone_No, String vehicle_type_Name, String customer_Name, String phone_No, String email,Double service_Charge,
			Double charge_per_Km) {
	super();
	this.bookingId = booking_Id;
	this.driverId = driver_Id;
	this.customerId = customer_Id;
	this.sourceLocation = source_Location;
	this.destinationationLocation = destinationation_Location;
	this.pickupTime = pickup_Time;
	this.dropTime = drop_Time;
	this.bookingStatus = booking_Status;
	this.vehicleCategoryId = vehicle_category_Id;
	this.bookingDate = booking_Date;
	this.cityId = city_Id;
	this.source = source;
	this.destinationation = destinationation;
	this.cityName = city_Name;
	this.driverName = driver_Name;
	this.vehicleNo = vehicle_No;
	this.driverPhoneNo = driver_phone_No;
	this.vehicleType = vehicle_type_Name;
	this.customerName = customer_Name;
	this.phoneNo = phone_No;
	this.email = email;
	this.serviceCharge = service_Charge;
	this.chargePerKm = charge_per_Km;
}

	public  Booking() {
		
	}

	public Booking(String booking_Id, String customer_Id, String source_Location, String destinationation_Location,
			String booking_Status, String vehicle_category_Id) {
		super();
		this.bookingId = booking_Id;
		this.customerId = customer_Id;
		this.sourceLocation = source_Location;
		this.destinationationLocation = destinationation_Location;
		this.bookingStatus = booking_Status;
		this.vehicleCategoryId = vehicle_category_Id;
	}

	public Booking(String booking_Id, String driver_Id, String customer_Id, String source_Location,
			String destinationation_Location, String pickup_Time, String drop_Time, String booking_Status,
			String vehicle_category_Id,Date booking_Date, String city_Id) {
		super();
		this.bookingId = booking_Id;
		this.driverId = driver_Id;
		this.customerId = customer_Id;
		this.sourceLocation = source_Location;
		this.destinationationLocation = destinationation_Location;
		this.pickupTime = pickup_Time;
		this.dropTime = drop_Time;
		this.bookingStatus = booking_Status;
		this.vehicleCategoryId = vehicle_category_Id;
		this.bookingDate = booking_Date;
		this.cityId =city_Id;
	}

	public Booking(String booking_Id, String driver_Id, String customer_Id, String source_Location,
			String destinationation_Location, String pickup_Time, String drop_Time, String booking_Status,
			String vehicle_category_Id) {
		super();
		this.bookingId = booking_Id;
		this.driverId = driver_Id;
		this.customerId = customer_Id;
		this.sourceLocation = source_Location;
		this.destinationationLocation = destinationation_Location;
		this.pickupTime = pickup_Time;
		this.dropTime = drop_Time;
		this.bookingStatus = booking_Status;
		this.vehicleCategoryId = vehicle_category_Id;
	
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String city_Id) {
		this.cityId = city_Id;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date booking_Date) {
		this.bookingDate = booking_Date;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String booking_Id) {
		this.bookingId = booking_Id;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driver_Id) {
		this.driverId = driver_Id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customer_Id) {
		this.customerId = customer_Id;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String source_Location) {
		this.sourceLocation = source_Location;
	}

	public String getDestinationationLocation() {
		return destinationationLocation;
	}

	public void setDestinationationLocation(String destinationation_Location) {
		this.destinationationLocation = destinationation_Location;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickup_Time) {
		this.pickupTime = pickup_Time;
	}

	public String getDropTime() {
		return dropTime;
	}

	public void setDropTime(String drop_Time) {
		this.dropTime = drop_Time;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String booking_Status) {
		this.bookingStatus = booking_Status;
	}

	public String getVehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setVehicleCategoryId(String vehicle_category_Id) {
		this.vehicleCategoryId = vehicle_category_Id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestinationation() {
		return destinationation;
	}

	public void setDestinationation(String destinationation) {
		this.destinationation = destinationation;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String city_Name) {
		this.cityName = city_Name;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driver_Name) {
		this.driverName = driver_Name;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicle_No) {
		this.vehicleNo = vehicle_No;
	}

	public String getDriverPhoneNo() {
		return driverPhoneNo;
	}

	public void setDriverPhoneNo(String driver_phone_No) {
		this.driverPhoneNo = driver_phone_No;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicle_type_Name) {
		this.vehicleType = vehicle_type_Name;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customer_Name) {
		this.customerName = customer_Name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phone_No) {
		this.phoneNo = phone_No;
	}

	public String getEmail() {
		return email;
	}

	 
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double service_Charge) {
		this.serviceCharge = service_Charge;
	}

	public Double getChargePerKm() {
		return chargePerKm;
	}

	public void setChargePerKm(Double charge_per_Km) {
		this.chargePerKm = charge_per_Km;
	}

	public Double getChargesCalculated() {
		return chargesCalculated;
	}

	public void setChargesCalculated(Double charges_Calculated) {
		this.chargesCalculated = charges_Calculated;
	}

	public Double getKmCovered() {
		return kmCovered;
	}

	public void setKmCovered(Double km_Covered) {
		this.kmCovered = km_Covered;
	}
	
	

}
