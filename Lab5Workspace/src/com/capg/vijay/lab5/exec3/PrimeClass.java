package com.capg.vijay.lab5.exec3;

public class PrimeClass {

	static void checkPrimeMethod(int primeNumber) 
	{
		if (primeNumber <=1)
			System.out.println("It has no prime number");
		else if(primeNumber == 2)
		{
			System.out.println("It has 1 prime number :2");
		}
		else
		{
			System.out.println("method");
			for(int loop=1;loop<=primeNumber;loop++)
			{
				int count=0;
				for(int loop1=1;loop1<=primeNumber;loop1++)
				{
					if(loop%loop1 == 0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(loop);
				}
			}
	
		}
	
		
		
		
		
		
		
	}
}
