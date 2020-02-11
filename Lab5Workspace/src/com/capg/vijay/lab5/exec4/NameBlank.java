/**
 * 
 */
package com.capg.vijay.lab5.exec4;
public class NameBlank 
{
	static void nameBlankMethod(String firstname, String lastname) throws NameException{
		int firstnameLength = firstname.length();
		int lastnameLength = lastname.length();
		if(firstnameLength ==0 && lastnameLength ==0)
		{
			throw new NameException("Invalid name");
		}
		System.out.println("your first name is "+ firstname +" lastname "+ lastname );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			nameBlankMethod("vijay","venkat");
			nameBlankMethod("","");
		}
		catch(NameException e)
		{
			System.out.println("caught"+ e);
		}
	}
}
