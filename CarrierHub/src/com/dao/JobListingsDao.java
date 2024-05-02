package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobListings;

public interface JobListingsDao {

	int save(JobListings jobListings) throws SQLException;

	List<JobListings> findAll() throws SQLException;

}
