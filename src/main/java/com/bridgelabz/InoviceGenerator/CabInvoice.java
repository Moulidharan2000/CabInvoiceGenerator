package com.bridgelabz.InoviceGenerator;

import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {
		
		int cost_perkm = 10;
		int cost_perminute = 1;
		int minimum_fare = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the User ID : ");
		int id = scan.nextInt();
		System.out.print("Enter the Number of Rides : ");
		int rides = scan.nextInt();
		double amount = 0;
		double temp = 0;
		for(int i=0; i<rides; i++) {
			System.out.print("Enter the Distance in KiloMeter : ");
			double distance = scan.nextDouble();
			System.out.print("Enter the Time in Minutes : ");
			double time = scan.nextDouble();
			amount = distance * cost_perkm + time * cost_perminute + temp;
			temp = amount;
		}
		double average = amount / rides;
		if(amount >= minimum_fare) {
			System.out.println("User ID : "+id);
			System.out.println("Total Rides : " + rides);
			System.out.println("Total Fare : " + amount);
			System.out.println("Average Fare for Rides : " + average);
		}
		else
			System.out.println("No Rides for Below the Minimum Fare....");
	}
}
