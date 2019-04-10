package com.poc.secureemployee.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	public static List<Employee> getEmployees() {

		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(1, "Amitabh", "30", "horizontal", 10000, "05-12-2016", "Bangalore");
		empList.add(e1);
		Employee e2 = new Employee(2, "Saroj", "27", "IPM", 20000, "09-12-2017", "Bangalore");
		empList.add(e2);
		Employee e3 = new Employee(3, "Prakash", "35", "horizontal", 30000, "05-10-2016", "Bangalore");
		empList.add(e3);
		Employee e4 = new Employee(4, "Dileep", "28", "IPM", 40000, "05-12-2016", "Hydrabad");
		empList.add(e4);
		Employee e5 = new Employee(5, "Satya", "26", "horizontal", 50000, "05-07-2016", "Bangalore");
		empList.add(e5);

		return empList;

	}

	public static Employee getEmployeeByID(int id) {
		List<Employee> empList = getEmployees();
		Employee emp = null;
		for (Employee e : empList) {
			if (id == e.getId())
				emp = e;
		}
		return emp;
	}

}
