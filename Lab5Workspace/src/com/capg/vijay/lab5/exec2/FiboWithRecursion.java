package com.capg.vijay.lab5.exec2;

public class FiboWithRecursion 
{

	static int a=1,b=1,fibo=0;
	int getFiboWithRecursion(int number)
	{
		if(number>0)
		{
				fibo=a+b;
				b=a;
				a=fibo;
				getFiboWithRecursion(number-1);
		}
		return a;
		
	}
	
}
