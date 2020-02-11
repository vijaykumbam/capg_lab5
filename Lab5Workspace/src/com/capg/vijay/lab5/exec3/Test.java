/**
 * 
 */
package com.capg.vijay.lab5.exec3;
import java.util.*;
/**
 * @author a
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeClass obj = new PrimeClass();
		System.out.println("Enter the nth prime number");
		Scanner sc = new Scanner(System.in);
		int primeNumber = sc.nextInt();
		obj.checkPrimeMethod(primeNumber);
	}
}
