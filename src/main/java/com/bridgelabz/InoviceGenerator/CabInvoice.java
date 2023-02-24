package com.bridgelabz.InoviceGenerator;

import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {
		
		int cost_perkm = 10;
		int cost_perminute = 1;
		int minimum_fare = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Distance in KiloMeter : ");
		double distance = scan.nextDouble();
		System.out.print("Enter the Time in Minutes : ");
		double time = scan.nextDouble();
		double amount = distance * cost_perkm + time * cost_perminute;
		
		if(amount >= minimum_fare) 
			System.out.println("Total Fare : " + amount);
		else
			System.out.println("No Rides for Below the Minimum Fare....");
	}
}
