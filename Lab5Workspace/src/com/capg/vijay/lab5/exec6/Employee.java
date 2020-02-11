/**
 * 
 */
package com.capg.vijay.lab5.exec6;

import java.lang.Exception;
class Employee{
	static void empSalary(int salary) throws EmployeeSalaryException
	{
		System.out.println("Emp salary is ="+ salary);
		if(salary <3000)
		{
			throw new EmployeeSalaryException("Your salary is below 3000");
		}
		System.out.println("Your salary is above 3000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			empSalary(4000);
			empSalary(1000);
			
		}
		catch(EmployeeSalaryException e) {
			System.out.println("caught"+ e);
		}
	}
}