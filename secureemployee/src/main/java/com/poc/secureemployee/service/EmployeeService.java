package com.poc.secureemployee.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.secureemployee.data.Employee;
import com.poc.secureemployee.data.EmployeeData;

@RestController
@RequestMapping("api/v1/")
public class EmployeeService {

	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> list() {
		return EmployeeData.getEmployees();
	}

	@RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable int id) {
		return EmployeeData.getEmployeeByID(id);
	}

}
