package com.poc.sslemployee.data;

public class Employee {
	
	private int id;
	private String name;
	private String age;
	private String dept;
	private float salary;
	private String join_Date;
	private String city;
	
	public Employee(int id, String name, String age, String dept, float salary, String join_Date, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.join_Date = join_Date;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getJoin_Date() {
		return join_Date;
	}

	public void setJoin_Date(String join_Date) {
		this.join_Date = join_Date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary
				+ ", join_Date=" + join_Date + ", city=" + city + "]";
	}
}
