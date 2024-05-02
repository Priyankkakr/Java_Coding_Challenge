package com.dao;

import java.sql.SQLException;

import com.model.JobApplications;

public interface JobApplicationsDao {

	int save(JobApplications jobApplications) throws SQLException;

}
