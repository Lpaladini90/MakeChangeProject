package makechange;
import java.util.Scanner;
public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the item being purchase?");
		String purchasedItem = sc.nextLine();
		
		System.out.println("What is the cost of the item?");
		double costOfItem = sc.nextDouble();
		
		double tax = .067;
		double total = costOfItem + (costOfItem * tax);
		
		System.out.printf("The total price for " + purchasedItem + " with tax is $%.2f.\n", total);
		System.out.println("How much money was received by the customer to pay for the " + purchasedItem + "?");
		double moneyRecieved = sc.nextDouble();
		
		double changeDue = (moneyRecieved - total);
		
		if (moneyRecieved == total) {
			System.out.println("No change, exact cost was provided. ");
		}
		else if (moneyRecieved > total) {
			double hundreds = 100.0;
			double fifties = 50.0;
			double twenties = 20.0;
			double tens = 10.0;
			double fives = 5.0;
			double ones = 1.0;
			double twentyFiveCents = .25;
			double tenCents = .10;
			double fiveCents = .05;
			double oneCents = .01;
			System.out.printf("The customer's change is $ %.2f", changeDue);
			System.out.println();
			while (changeDue >= 0) {
				if (changeDue >= 100) {
					int oneHundredDollarBills = (int) (changeDue / hundreds);
					System.out.println("\nHundred Dollar Bills: " + oneHundredDollarBills + ", ");
					changeDue -= (hundreds * oneHundredDollarBills);
				} else if (changeDue >= 50) {
					int fiftyDollarBills = (int) (changeDue / fifties);
					System.out.print("\tFifty Dollar Bills: " + fiftyDollarBills + ", ");
					changeDue -= (fifties * fiftyDollarBills);
				}
				else if (changeDue >= 20) {
					int twentyDollarBills = (int) (changeDue / twenties);
					System.out.print("Twenty Dollar Bills: " + twentyDollarBills + ", ");
					changeDue -= (twenties * twentyDollarBills);
				} else if (changeDue >= 10) {
					int tenDollarBills = (int) (changeDue / tens);
					System.out.print("Ten Dollar Bills: " + tenDollarBills + ", ");
					changeDue -= (tens * tenDollarBills);
				} else if (changeDue >= 5) {
					int fiveDollarBills = (int) (changeDue / fives);
					System.out.print("Five Dollar Bills: " + fiveDollarBills + ", ");
					changeDue -= (fives * fiveDollarBills);
				} else if (changeDue >= 1) {
					int oneDollarBills = (int) (changeDue / ones);
					System.out.print("One Dollar Bills: " + oneDollarBills + ", ");
					changeDue -= (ones * oneDollarBills);
				} else if (changeDue >= .25) {
					int quarters = (int) (changeDue / twentyFiveCents);
					System.out.print("Quarters: " + quarters + ", ");
					changeDue -= (twentyFiveCents * quarters);
				} else if (changeDue >= .10) {
					int dimes = (int) (changeDue / tenCents);
					System.out.print("Dimes: " + dimes + ",");
					changeDue -= (tenCents * dimes);
				} else if (changeDue >= .05) {
					int nickles = (int) (changeDue / fiveCents);
					System.out.print("Nickles: " + nickles + ", ");
					changeDue -= (fiveCents * nickles);
				} else if (changeDue >= .01) {
					int pennies = (int) Math.round((changeDue / oneCents));
					System.out.print("Pennies: " + pennies);
					changeDue -=  ((oneCents * pennies) * 100);
					changeDue -= ((oneCents * pennies) * 100);
				}

			}
		} else {
			System.out.println("The " + moneyRecieved + " is not enough to cover the cost of " + purchasedItem + ".");
			sc.close();
		}

	}
}
