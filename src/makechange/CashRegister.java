package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the cost of the item?");
		double costOfItem = sc.nextDouble();

		System.out.println("How much money was received by the customer to pay for the item ");
		double moneyRecieved = sc.nextDouble();

		double changeDue = (moneyRecieved - costOfItem);

		if (moneyRecieved == costOfItem) {

			System.out.println("No change, exact cost was provided. ");

		}

		else if (moneyRecieved > costOfItem) {

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
				}

			}
		} else {
			System.out.println("Error message.");
			// System.out.println("The customer still owes $ " + (total - moneyRecieved));

			sc.close();
		}

	}
}

// System.out.println(changeDue + " given back to the customer should be in the
// following denominations: " );

//			twentyDollarBills = (int)(changeDue/twenties);
//			tenDollarBills = (int)(changeDue- (twenties * twentyDollarBills));
//			fiveDollarBills = (int) (changeDue - (twenties * twentyDollarBills) - (tens* tenDollarBills));
// System.out.println("");
// hard code example- change is 50.50

//		System.out.println("$20: " + twentyDollarBills);
//		
//		System.out.println("$10: " + tenDollarBills);
//		
//		System.out.println("$5: " + fiveDollarBills);
//		
//		System.out.println("$1: " + oneDollarBills);
//		
//		System.out.println("$.25: " + quarters);
//		
//		System.out.println("$.10: " + dimes);
//		
//		System.out.println("$.05: " + nickles);
//		
//		System.out.println("$.01: " + pennies);

// twentyDollarBills = (int)(changeDue/twenties); // this equals 2 ( 2 twenty
// dollar bills)
//		changeDue = changeDue/200; 
//		
//		
//		tenDollarBills = (int)(changeDue/tens);
//		changeDue = changeDue/100;
//		
//		fiveDollarBills = (int)(changeDue/fives);
//		changeDue = changeDue/50;
//		
//		oneDollarBills = (int)(changeDue/ones);
//		changeDue = changeDue/10;
//		
//		quarters = (int)(changeDue/twentyFiveCents);
//		changeDue = changeDue/25;
//		 
//		dimes = (int)(changeDue/tenCents);
//		changeDue = changeDue/10;
//		
//		nickles = (int)(changeDue/fiveCents);
//		changeDue = changeDue/5;
//		
//		pennies = (int)(changeDue/oneCents);
//		changeDue = changeDue/1;
