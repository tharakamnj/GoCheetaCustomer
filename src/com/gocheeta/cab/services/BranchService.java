package com.gocheeta.cab.services;

import java.util.List;

import javax.sql.DataSource;

import com.gocheeta.cab.dao.BranchDao;
import com.gocheeta.cab.entities.Branch;





public class BranchService {
	
	public static List<Branch> getBranch(DataSource dataSource,String city_Id){
		
		return BranchDao.getBranch(dataSource,city_Id);
	}


	
	
	
}
