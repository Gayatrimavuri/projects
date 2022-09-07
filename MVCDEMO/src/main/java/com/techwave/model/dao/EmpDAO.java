package com.techwave.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.techwave.model.pojo.Emp;

public class EmpDAO {
	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	//using Statement
  public String insertEmp(Emp E)
  {
	  
	  String query="insert into empjdbc values("+E.getEmpno()+",'"+E.getEname()+"','"+E.getGender()+"','"+E.getDob()+"',"+E.getBasic()+")";
	  jt.update(query);
	  
	  return "1 row inserted";
  }
  //using Prepared Statement
  public String insertEmpPS(final Emp E)
  {
	  
	  String query="insert into empjdbc values(?,?,?,?,?)";
	  return jt.execute(query,new PreparedStatementCallback<String>() {

		@Override
		public String doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
			ps.setInt(1, E.getEmpno());
			ps.setString(2, E.getEname());
			ps.setString(3, E.getGender());
			ps.setString(4, E.getDob());
			ps.setDouble(5, E.getBasic());
			ps.execute();
			return "1 row inserted";
		}
	} );
  
  
  }
  public Emp getEmpDetails(int empno)
  {
	  System.out.println("Hello");
	  String query="Select * from empjdbc where empno=?";
	  return jt.queryForObject(query,new Object[] {empno},new EmpRowMapper()) ;
  }
  public List<Map<String, Object>> getEmpDetails1(int empno)
  {
	  System.out.println("Hello");
	  String gender="Male";
	  String query="Select * from empjdbc where gender=?";
	  return jt.queryForList(query,new Object[] {gender}) ;
  } 
}







