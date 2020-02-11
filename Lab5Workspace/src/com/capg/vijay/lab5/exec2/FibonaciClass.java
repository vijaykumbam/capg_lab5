package com.capg.vijay.lab5.exec2;

public class FibonaciClass {
	
	static void getFibo(int number)
	{
		int a=1; int b=1; int fibo=0;
		for(int loop =1;loop<number;loop++)
		{
			fibo = a+b;
			a=b;
			b=fibo;
		}
		System.out.println("The fibo of "+number+" is: " +fibo);
	}
}
