package com.bridgelabz.InoviceGenerator;

import java.util.Scanner;

public class CabInvoice {

	public static void main(String[] args) {
		
		int cost_perkm, cost_perminute, minimum_fare = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the User ID : ");
		int id = scan.nextInt();
		System.out.print("Enter the Number of Rides : ");
		int rides = scan.nextInt();
		double amount = 0;
		double temp = 0;
		System.out.println("Ride categories - 1.Normal Ride, 2.Premium Ride.");
		System.out.print("Enter the Ride Category : ");
		int type = scan.nextInt();
		switch(type) {
		case 1:
			cost_perkm = 10;
			cost_perminute = 1;
			minimum_fare = 5;
			for(int i=0; i<rides; i++) {
				System.out.print("Enter the Distance in KiloMeter : ");
				double distance = scan.nextDouble();
				System.out.print("Enter the Time in Minutes : ");
				double time = scan.nextDouble();
				amount = distance * cost_perkm + time * cost_perminute + temp;
				temp = amount;
			}
			break;
		case 2:
			cost_perkm = 15;
			cost_perminute = 2;
			minimum_fare = 20;
			for(int i=0; i<rides; i++) {
				System.out.print("Enter the Distance in KiloMeter : ");
				double distance = scan.nextDouble();
				System.out.print("Enter the Time in Minutes : ");
				double time = scan.nextDouble();
				amount = distance * cost_perkm + time * cost_perminute + temp;
				temp = amount;
			}
			break;
		}
		double average = amount / rides;
		if(amount >= minimum_fare) {
			System.out.println("User ID : " + id);
			System.out.println("The Ride Category : "+ type);
			System.out.println("Total Rides : " + rides);
			System.out.println("Total Fare : " + amount);
			System.out.println("Average Fare for Rides : " + average);
		}
		else
			System.out.println("No Rides for Below the Minimum Fare....");
	}
}
