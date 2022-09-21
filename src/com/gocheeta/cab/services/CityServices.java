package com.gocheeta.cab.services;

import java.util.List;

import javax.sql.DataSource;

import com.gocheeta.cab.dao.CityDao;
import com.gocheeta.cab.entities.City;


public class CityServices {
	
	public static List<City> getCity(DataSource dataSource){
		
		return CityDao.getCity(dataSource);
	}
	
	
}
