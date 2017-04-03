package com.sample.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.dto.EmployeeDto;

public class EmpRowmapper implements RowMapper 
{

	public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDto dto=new EmployeeDto();
		dto.setEmpID(rs.getInt("id"));
		dto.setEmpName(rs.getString("name"));
		dto.setDesignation(rs.getString("designation"));
		System.out.println(dto.getDesignation()+""+dto.getEmpID()+""+dto.getEmpName());
		//dto.setEmpID(1);
		//dto.setEmpName("Rahul");
		//dto.setDesignation("Developer");
		return dto;
	}


}
