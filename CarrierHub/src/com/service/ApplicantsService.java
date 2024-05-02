package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Applicants;
import com.dao.ApplicantsDao;
import com.dao.ApplicantsDaoImpl;

public class ApplicantsService {
	ApplicantsDao dao= new ApplicantsDaoImpl();

	public List<Applicants> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public int save(Applicants a) throws SQLException {
		// TODO Auto-generated method stub
		return dao.save(a);
		
	}

}
