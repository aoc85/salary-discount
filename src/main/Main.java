package main;

import java.util.List;

import db.EmployeeSalaryDaoImp;
import model.dto.EmployeeSalary;

public class Main {

	public static void main(String[] args) {
		
		List<EmployeeSalary> list = new EmployeeSalaryDaoImp().employeeList();
		
		list.forEach( employee -> employee.setLiquidSalary(employee.getGrossSalary().subtract(employee.getDiscounts())));
		list.sort((employee1, employee2) -> employee1.getLiquidSalary().compareTo(employee2.getLiquidSalary()));
		list.forEach(System.out::println);
	}

}
