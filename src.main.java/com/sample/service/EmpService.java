package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sample.model.ResponseBean;

@Service
public class EmpService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 public ResponseBean findEmpData(int id) 
	 {
		 System.out.println("I am in Service"+id);
		 ResponseBean res=new ResponseBean();
		 
		 
		 /*res.setDesigntion("Deveeeee");
		 res.setName("11111111Deveeeee");*/
		return res; 
	 }
}
