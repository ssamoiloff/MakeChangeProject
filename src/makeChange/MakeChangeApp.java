package makeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter item price: ");
		double price = kb.nextDouble();
		System.out.print("Enter amount tendered: ");
		double amtTendered = kb.nextDouble();
		kb.close();
		
		if (price == amtTendered) {
			System.out.println("You provided exact change! Nice!");
		} else if (price > amtTendered) {
			System.out.println("I know these are hard times, but we don't do discounts.");
		} else {
			
		}
	}

}
