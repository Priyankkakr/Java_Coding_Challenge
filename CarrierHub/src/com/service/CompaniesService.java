package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Companies;
import com.dao.CompaniesDao;
import com.dao.CompaniesDaoImpl;

public class CompaniesService {
	CompaniesDao dao = new CompaniesDaoImpl();

	public List<Companies> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
