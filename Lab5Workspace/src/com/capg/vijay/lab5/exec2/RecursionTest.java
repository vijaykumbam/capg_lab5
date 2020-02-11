package com.capg.vijay.lab5.exec2;

import java.util.Scanner;

public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		FiboWithRecursion obj = new FiboWithRecursion();
		System.out.println(obj.getFiboWithRecursion(number));
		sc.close();
	}

}
