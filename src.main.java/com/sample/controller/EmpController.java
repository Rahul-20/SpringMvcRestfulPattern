package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.ResponseBean;
import com.sample.request.RequestBean;
import com.sample.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping(value = "/emp.do", method = RequestMethod.POST)
	public @ResponseBody ResponseBean getEmpData(@RequestBody RequestBean bean) throws ParseException 
	{
		System.out.println("I am in COntroller::::::::::::::::");
		ResponseBean res=new ResponseBean();
		int id=bean.getId();
		//int id=1;
		System.out.println("id::::::::::::::"+id);
		res=empService.findEmpData(id);
		System.out.println(res.getDesigntion());
		System.out.println(res.getName());
		return res;	
	}
}
