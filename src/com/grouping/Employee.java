package com.grouping;

public class Employee {

	private int empId;
	private String empName;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int age) {
		super();
		this.age = age;
	}
	private String dept;
	public Employee(int empId, String empName, int age, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	
	
}
