package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.JobApplications;
import com.utility.DBConnection;

public class JobApplicationsDaoImpl implements JobApplicationsDao {
	JobApplications jobApplications = new JobApplications();

	@Override
	public int save(JobApplications jobApplications) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO JobApplications (Application_id, Job_iD, Applicant_id, Application_date, Cover_letter) values (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobApplications.getApplicationId());
		pstmt.setInt(2, jobApplications.getJobId());
		pstmt.setInt(3, jobApplications.getApplicantID());
		pstmt.setString(4, jobApplications.getApplicaionDate());
		pstmt.setString(5, jobApplications.getCoverLetter());
		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

}
