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
		int twenties = twentyBill(change);
		int tens = tenBill(change);
		int fives = fiveBill(change);
		int ones = oneBill(change);
		int quarters = quarters(change);
		int dimes = dimes(change);
		int nickels = nickels(change);
		int pennies = pennies(change);

		System.out.println("Change due is:\n");
		
		if (twenties != 0) {
			System.out.println(twenties + " $20 bills");
		}
		if (tens != 0) {
			System.out.println(tens + " $10 bills");
		}
		if (fives !=0) {
			System.out.println(fives + " $5 bills");
		}
		if (ones != 0) {
			System.out.println(ones + " $1 bills");
		}
		if (quarters != 0) {
			System.out.println(quarters + " quarters");
		}
		if (dimes != 0) {
			System.out.println(quarters + " dimes");
		}
		if (nickels != 0) {
			System.out.println(nickels + " nickels");
		}
		if (pennies != 0) {
			System.out.println(pennies + " pennies");
		}

	}

//	Bill change methods
	public static int twentyBill(double change) {
		int changeDue = (int) (change * 100);

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

		return twenties;
	}

	public static int tenBill(double change) {
		int changeDue = (int) (change * 100);

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

		return tens;
	}

	public static int fiveBill(double change) {
		int changeDue = (int) (change * 100);

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

		return fives;
	}

	public static int oneBill(double change) {
		int changeDue = (int) (change * 100);

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

		return ones;
	}

//	Coin change methods
	public static int quarters(double change) {
		int changeDue = (int) (change * 100);

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

		return quarters;
	}

	public static int dimes(double change) {
		int changeDue = (int) (change * 100);

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

		return dimes;
	}

	public static int nickels(double change) {
		int changeDue = (int) (change * 100);

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

		return nickels;
	}

	public static int pennies(double change) {
		int changeDue = (int) (change * 100);

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

		return pennies;
	}

}

/*
 * int change = (int)(changeDue * 100);
 * 
 * int numDollars = change/100; change = change % 100;
 */

// if equal to or greater than 20.0, execute twentyBill (and how many)
// if equal to or greater than 10.0 AND less than 20.0, tenBill
// .. fiveBill
// .. oneBill
// .. quarters
// .. dimes
// .. nickels
// .. pennies