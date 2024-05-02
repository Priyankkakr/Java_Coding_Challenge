package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Applicants;

public interface ApplicantsDao {

	List<Applicants> findAll() throws SQLException;

	int save(Applicants a) throws SQLException;

}
