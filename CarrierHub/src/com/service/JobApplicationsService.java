package com.service;

import com.model.JobApplications;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobApplicationsDao;
import com.dao.JobApplicationsDaoImpl;

public class JobApplicationsService {
	JobApplicationsDao dao = new JobApplicationsDaoImpl();

	public int save(JobApplications jobApplications) throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(jobApplications);
		
	}

	public List<JobApplications> findAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
