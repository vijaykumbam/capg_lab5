/**
 * 
 */
package com.capg.vijay.lab5.exec2;
import java.util.*;
/**
 * @author a
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonaciClass obj = new FibonaciClass();
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		obj.getFibo(number);
		sc.close();
	}
}
