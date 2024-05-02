package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.JobListings;
import com.utility.DBConnection;

public class JobListingsDaoImpl implements JobListingsDao {
	JobListings jobListings = new JobListings();
	@Override
	public int save(JobListings jobListings) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO JobListings (Job_iD, Company_iD, Job_title, Job_description, Job_location, Salary, Job_type, Posted_date)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, jobListings.getJobID());
		pstmt.setInt(2, jobListings.getCompanyID());
		pstmt.setString(3, jobListings.getJobTitle());
		pstmt.setString(4, jobListings.getJobDescription());
		pstmt.setString(5, jobListings.getJoblocation());
		pstmt.setDouble(6, jobListings.getSalary());
		pstmt.setString(7, jobListings.getJobType());
		pstmt.setString(8, jobListings.getPostedDate());

		int status = pstmt.executeUpdate(); 
		DBConnection.dbClose();
		
		return status;
	}
	@Override
	public List<JobListings> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "select * from JobListings ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<JobListings> list = new ArrayList<>();
		while(rst.next()==true) {
			int JobId = rst.getInt("Job_iD");
			int CompanyId= rst.getInt("Company_iD");
			String JobTitle = rst.getString("Job_title");
			String JobDescription = rst.getString("Job_description");
			String JobLocation = rst.getString("Job_location");
			double Salary = rst.getDouble("Salary");
			String JobType = rst.getString("Job_type");
			String PostedDate = rst.getString("Posted_date");
			JobListings JobListing = new JobListings(JobId,CompanyId,JobTitle,JobDescription,JobLocation,Salary,JobType,PostedDate);
			list.add(JobListing);
		}
		DBConnection.dbClose();
		return list;
	}

}
