package com.service;

import com.model.JobListings;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobListingsDao;
import com.dao.JobListingsDaoImpl;

public class JobListingsService {
	JobListingsDao dao = new JobListingsDaoImpl();
	
	public int save(JobListings jobListings) throws SQLException {
		return dao.save(jobListings);
		
	}

	public List<JobListings> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
