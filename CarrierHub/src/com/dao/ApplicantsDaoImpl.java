package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Applicants;
import com.utility.DBConnection;

public class ApplicantsDaoImpl implements ApplicantsDao {
	Applicants a = new Applicants();

	@Override
	public List<Applicants> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "select * from Applicants ";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Applicants> listapp = new ArrayList<>();
		while(rst.next()==true) {
			int ApplicantId = rst.getInt("Applicant_id");
			String fname = rst.getString("First_name");
			String lname = rst.getString("Last_name");
			String email = rst.getString("Email");
			String Phone = rst.getString("Phone");
			String Resume = rst.getString("Resume");
			Applicants app= new Applicants(ApplicantId,fname,lname,email,Phone,Resume);
			listapp.add(app);
		}
		DBConnection.dbClose();
		return listapp;
	}

	@Override
	public int save(Applicants a) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "insert into Applicants (Applicant_id, First_name, Last_name, Email, Phone, Resume)"
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,a.getApplicantId());
		pstmt.setString(2, a.getFirstName());
		pstmt.setString(3, a.getLastName());
		pstmt.setString(4, a.getEmail());
		pstmt.setString(5, a.getPhone());
		pstmt.setString(6, a.getResume());
		int status = pstmt.executeUpdate(); 
		DBConnection.dbClose();
		return status;
	}

}
