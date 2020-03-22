package makeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
//	User prompts
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter amount due: ");
		double price = kb.nextDouble();
		System.out.print("Enter amount tendered: ");
		double tendered = kb.nextDouble();
		kb.close();

		double change = tendered - price;
//	if/else logic to determine valid input
		if (price == tendered) {
			System.out.println("You provided exact change! Nice!");
		} else if (price > tendered) {
			System.out.println("I know these are hard times, but we don't do discounts.");
		} else {
			printChange(change);
		}
	}

//	Method that calls/stores notes/coins values, then prints change owed
	public static void printChange(double change) {
		int twenties = twentyBill(change);
		int tens = tenBill(change);
		int fives = fiveBill(change);
		int ones = oneBill(change);
		int quarters = quarters(change);
		int dimes = dimes(change);
		int nickels = nickels(change);
		int pennies = pennies(change);

		System.out.println("\nChange due is:\n");
		
		if (twenties != 0) {
			if (twenties < 2) {
				System.out.println("\t" + twenties + "  $20 bill");
			} else {
				System.out.println("\t" + twenties + "  $20 bills");
			}
		}
		if (tens != 0) {
			if (tens < 2) {
				System.out.println("\t" + tens + "  $10 bill");
			} else {
				System.out.println("\t" + tens + "  $10 bills");
			}
		}
		if (fives !=0) {
			if (fives < 2) {
				System.out.println("\t" + fives + "  $5 bill");
			} else {
				System.out.println("\t" + fives + "  $5 bills");				
			}
		}
		if (ones != 0) {
			if (ones < 2) {
				System.out.println("\t" + ones + "  $1 bill");
			} else {
				System.out.println("\t" + ones + "  $1 bills");	
			}
		}
		if (quarters != 0) {
			if (quarters < 2) {
				System.out.println("\t" + quarters + "  quarter");
			} else {
				System.out.println("\t" + quarters + "  quarters");			
			}
		}
		if (dimes != 0) {
			if (dimes < 2) {
				System.out.println("\t" + dimes + "  dime");
			} else {
				System.out.println("\t" + dimes + "  dimes");				
			}
		}
		if (nickels != 0) {
			if (nickels < 2) {
				System.out.println("\t" + nickels + "  nickel");
			} else {
				System.out.println("\t" + nickels + "  nickels");				
			}
		}
		if (pennies != 0) {
			if (pennies < 2) {
				System.out.println("\t" + pennies + "  penny");
			} else {
				System.out.println("\t" + pennies + "  pennies");				
			}
		}

	}

//	Bill change methods (calculate and convert change into notes)
	public static int twentyBill(double change) {
		int twenties = (int)(change/20);

		return twenties;
	}

	public static int tenBill(double change) {
		int changeDue = (int) (change * 100);

		int twenties = changeDue / 2000;
		changeDue = changeDue % 2000;
		int tens = changeDue / 1000;

		return tens;
	}

	public static int fiveBill(double change) {
		int changeDue = (int) (change * 100);

		int twenties = changeDue / 2000;
		changeDue = changeDue % 2000;
		int tens = changeDue / 1000;
		changeDue = changeDue % 1000;
		int fives = changeDue / 500;

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

		return ones;
	}

//	Coin change methods (calculate and convert change into coins)
//	Switched to using Math.round() for better rounding
	public static int quarters(double change) {
		int changeDue = (int)Math.round(change*100);

		int twenties = changeDue / 2000;
		changeDue = changeDue % 2000;
		int tens = changeDue / 1000;
		changeDue = changeDue % 1000;
		int fives = changeDue / 500;
		changeDue = changeDue % 500;
		int ones = changeDue / 100;
		changeDue = changeDue % 100;
		int quarters = changeDue / 25;

		return quarters;
	}

	public static int dimes(double change) {
		int changeDue = (int)Math.round(change*100);

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

		return dimes;
	}

	public static int nickels(double change) {
		int changeDue = (int)Math.round(change*100);

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

		return nickels;
	}

	public static int pennies(double change) {
		int changeDue = (int)Math.round(change*100);

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