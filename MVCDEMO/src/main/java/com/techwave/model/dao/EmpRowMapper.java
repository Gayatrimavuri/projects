package com.techwave.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techwave.model.pojo.Emp;

public class EmpRowMapper implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Emp E=new Emp();
		E.setEmpno(rs.getInt(1));
		E.setEname(rs.getString(2));
		E.setGender(rs.getString(3));
		E.setDob(rs.getString(4));
		E.setBasic(rs.getDouble(5));
		return E;
	}

}
