package com.capg.vijay.lab5.exec6;

public class EmployeeSalaryException extends Exception 
{
	int salary;
	EmployeeSalaryException(int a){
		salary = a;
	}
	EmployeeSalaryException(String args)
	{
		super(args);
	}
	public String toString()
	{
		return "EmployeeSalaryException["+salary+"]";
	}

}
