package model.entity;

import java.math.BigDecimal;

public class Employee {

	private Integer employeeId;
	private String employeeNumber;
	private BigDecimal salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer employeeId, String employeeNumber, BigDecimal salary) {
		this.employeeId = employeeId;
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
