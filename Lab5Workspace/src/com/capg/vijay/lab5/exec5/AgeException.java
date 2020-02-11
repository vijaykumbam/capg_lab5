package com.capg.vijay.lab5.exec5;

public class AgeException  extends Exception{
	public int age;
	AgeException(int a)
	{
		int age = a;
	}
	 AgeException(String args) {
			super(args);
		 }
	 public String toString()      {
	        return "AgeException["+age+"]";
	     } 
}
