package makeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter item price: ");
		double price = kb.nextDouble();
		System.out.print("Enter amount tendered: ");
		double tendered = kb.nextDouble();
		kb.close();
		
		double change = tendered - price;
		
		if (price == tendered) {
			System.out.println("You provided exact change! Nice!");
		} else if (price > tendered) {
			System.out.println("I know these are hard times, but we don't do discounts.");
		} else {
			printChange(change);
		}
	}
	
	public static void printChange(double change) {
//		int twenties = twentyBill(change);
//		int tens = tenBill(change);
//		int fives = fiveBill(change);
//		int ones = oneBill(change);
//		int quarters = quarters(change);
//		int dimes = dimes(change);
//		int nickels = nickels(change);
//		int pennies = pennies(change);
		
		int changeDue = (int)(change * 100);
		
		int twenties = changeDue / 2000;
		changeDue = changeDue % 2000;
		int tens = changeDue / 1000;
		changeDue = changeDue % 1000;
		int fives = changeDue / 500;
		changeDue = changeDue % 500;
		int ones = changeDue / 100;
		changeDue = changeDue % 100;
		int quarters = changeDue / 25;
		changeDue = changeDue % 25;
		int dimes = changeDue / 10;
		changeDue = changeDue % 10;
		int nickels = changeDue / 5;
		changeDue = changeDue % 5;
		int pennies = changeDue;
		
//		if (change >= 20.0) {
//		} else if (change < 20.0 && change >=10.0) {
//			int tens = tenBill(change);
//		} else if 
		System.out.println("Your change is: ");
	}
	
//	Bill change methods
	public static int twentyBill(double change) {
		int twenties = (int)change/20;
		return twenties;
	}
	public static int tenBill(double change) {
		int tens = (int)change/10;
		return tens;
	}
	public static int fiveBill(double change) {
		int fives = (int)change/5;
		return fives;
	}
	public static int oneBill(double change) {
		int ones = (int)change;
		return ones;
	}
	
//	Coin change methods
//	public static int quarters(double change) {
//		int quarters = 
//		return quarters;
//	}
//	public static int dimes(double change) {
//		
//		return dimes;
//	}
//	public static int nickels(double change) {
//		
//		return nickels;
//	}
//	public static int pennies(double change) {
//		
//		return pennies;
//	}

}

/*
 * 	int change = (int)(changeDue * 100);
 * 	
 * 	int numDollars = change/100;
 * 	change = change % 100;
 */

// if equal to or greater than 20.0, execute twentyBill (and how many)
// if equal to or greater than 10.0 AND less than 20.0, tenBill
// .. fiveBill
// .. oneBill
// .. quarters
// .. dimes
// .. nickels
// .. pennies