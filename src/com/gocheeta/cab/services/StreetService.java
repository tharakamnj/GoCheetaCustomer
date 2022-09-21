package com.gocheeta.cab.services;

import java.util.List;

import javax.sql.DataSource;

import com.gocheeta.cab.dao.StreetDao;
import com.gocheeta.cab.entities.Street;





public class StreetService {
	
	
	public static List<Street> getStreet(DataSource dataSource,String city_Id){
			
			return StreetDao.getStreet(dataSource,city_Id);
	}
	
	public static List<Street> getStreetByCity(DataSource dataSource,String city_Id){
		
		return StreetDao.getStreetByCity(dataSource,city_Id);
	}
	
	

	

}
