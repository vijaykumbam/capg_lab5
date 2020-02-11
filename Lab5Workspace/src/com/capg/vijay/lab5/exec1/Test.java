package com.capg.vijay.lab5.exec1;
import java.util.*;
public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("choose the color \nred \nyellow \ngreen \n");
		TrafficLights obj = new TrafficLights();
		Scanner sc = new Scanner(System.in);
		String sw = sc.nextLine();
		obj.selectedLight(sw);
		sc.close();
	}
}
