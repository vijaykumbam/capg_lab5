package com.capg.vijay.lab5.exec1;

public class TrafficLights {

	static void selectedLight(String sw)
	{
		switch(sw)
		{
			case "red":
			{
				System.out.println("Stop buddy");
				break;
			}
			case "yellow":
			{
				System.out.println(" Get ready buddy");
				break;
			}
			case "green":
			{
				System.out.println("Go!");
				break;
			}
			default:
			{
				System.out.println("clever but not smart enough \nplease select appropriated color");
			}
		}
	}
}
