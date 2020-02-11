//validate a age of the person and display proper function using user
//defined function age of the person is above 15;
/**
 * 
 */
package com.capg.vijay.lab5.exec5;
import java.lang.Exception;
public class AgeOfPerson {
	static void ageMethod(int age) throws AgeException
	{
			//System.out.println("In agemethod");
			if(age < 18)
			{
				throw new AgeException("you are lessthan 18");
			}
			System.out.println("you are a young");
	}
	
	
	public static void main(String args[])
	{
		
		try {
			ageMethod(21);
			ageMethod(10);
		}
		catch(AgeException e)
		{
			System.out.println("Invalid age"+ e);
		}
	}
}