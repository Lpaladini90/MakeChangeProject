package makechange;

import java.util.Scanner;

public class MakeChange2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		 purchaseItemsArray(sc); 
			
		
			
		double total = 0.0;

		System.out.printf("The total price for " +  " with tax is $%.2f", total);

		System.out.println("\nHow much money was received by the customer to pay for " + "?");
		double moneyRecieved = sc.nextDouble();

		double changeDue = (moneyRecieved - total);
		

		if (moneyRecieved == total) {

			printNoChange();

		}

		else if (moneyRecieved > total) {

			makeChange(changeDue);

		} else {
			System.out.println("The customer did not provide enough to cover the cost of the $ " + total + ".");
			double notEnoughMoney = (total - moneyRecieved);
			System.out.printf("The customer still owes $%.2f.", notEnoughMoney);

			sc.close();
		}
		}

	

	public static String [] purchaseItemsArray(Scanner sc) {
		String [] purchasedItems = new String[10];
			
			 


		System.out.println("Is there more than one item being purchased?");
		String answer = sc.nextLine();
		
		if(answer.equalsIgnoreCase("yes")) {
			
				System.out.println("What is the first item being purchased?");
				 purchasedItems[1] = sc.nextLine(); 
//				 System.out.println("What is the cost of " + purchasedItems[1] );
//				 double purchasedItem1 = sc.nextDouble();
//				 double total = purchasedItem1;
				
				System.out.println("What is the next item?");
				purchasedItems[2] = sc.next();
				
			//	System.out.println("What is the cost of " + purchasedItems[2] );
//				 double purchasedItem2 = sc.nextDouble();
//				 total = purchasedItem1 + purchasedItem2;
				
				String anotherItem = anotherItem(sc);
			if (anotherItem.equalsIgnoreCase("yes")) {
					 
				System.out.println("What is the next item?");
				purchasedItems[3] = sc.nextLine();
				
				//System.out.println("What is the cost of " + purchasedItems[3] );
//				 double purchasedItem3 = sc.nextDouble();
				 String moreItems = anotherItem(sc);
				 
				 
					if(moreItems.equalsIgnoreCase("yes")) {
						System.out.println("What is the next item?");
						purchasedItems[4] = sc.nextLine();
						
//						System.out.println("What is the cost of " + purchasedItems[4] );
//						 double purchasedItem4 = sc.nextDouble();
						
						 moreItems = anotherItem(sc);
						 
						if(moreItems.equalsIgnoreCase("yes")) {
							System.out.println("What is the next item?");
							purchasedItems[5] = sc.nextLine();
							
//							System.out.println("What is the cost of " + purchasedItems[5] );
//							 double purchasedItem5 = sc.nextDouble();
							 moreItems = anotherItem(sc);
							 
							 
							if(moreItems.equalsIgnoreCase("yes")) {
								System.out.println("What is the next item?");
								purchasedItems[6] = sc.nextLine();
								
//								System.out.println("What is the cost of " + purchasedItems[6] );
//								 double purchasedItem6 = sc.nextDouble();
								 moreItems = anotherItem(sc);
							
								if(moreItems.equalsIgnoreCase("yes")) {
									System.out.println("What is the next item?");
									purchasedItems[7] = sc.nextLine();
									
//									System.out.println("What is the cost of " + purchasedItems[7] );
//									 double purchasedItem7 = sc.nextDouble();
									 
									 moreItems = anotherItem(sc);
									
									if(moreItems.equalsIgnoreCase("yes")) {
										System.out.println("What is the next item?");
										purchasedItems[8] = sc.nextLine();
										
//										System.out.println("What is the cost of " + purchasedItems[8] );
//										 double purchasedItem8 = sc.nextDouble();
										 
										 moreItems = anotherItem(sc);
									
										if(moreItems.equalsIgnoreCase("yes")) {
											System.out.println("What is the next item?");
											purchasedItems[9] = sc.nextLine();
											
//											System.out.println("What is the cost of " + purchasedItems[9] );
//											 double purchasedItem9 = sc.nextDouble();
											 
											 moreItems = anotherItem(sc);
											 
											
											
											if(moreItems.equalsIgnoreCase("yes")) {
												System.out.println("What is the next item?");
												purchasedItems[10] = sc.nextLine();
												
//												System.out.println("What is the cost of " + purchasedItems[10] );
//												 double purchasedItem10 = sc.nextDouble();
												 
												 moreItems = anotherItem(sc);
												
												
												 return purchasedItems;
											}
											else { 
												return purchasedItems;
											}  
											
										}else { 
											return purchasedItems;
										}  
									
									}else { 
										return purchasedItems;
									}  
									
									
								}else { 
									return purchasedItems;
								}  
							 
							}else { 
								return purchasedItems;
							}  
							
						}else { 
							return purchasedItems;
						}  
			
					}else {
						return purchasedItems; 
				
					}
				}
			
			return purchasedItems;
			} else if (answer.equalsIgnoreCase("no")) {
				System.out.println("What is the item being purchased?");
				purchasedItems[0] = sc.nextLine();
//				System.out.printf("What is the cost of %.2f", purchasedItems[0]);
//				double purchasedItemSingle = sc.nextDouble();
				
				return purchasedItems; 
				
		}
		
		
		return purchasedItems; 
		

		
	}
		
	public static String anotherItem(Scanner sc) {
		System.out.println("Is there another item?");
		String moreItems = sc.nextLine(); 
		return moreItems;
	}
	
	
	
	private static void printNoChange() {
		System.out.println("No change, exact cost was provided. ");
	}
	
	private static void makeChange(double changeDue) {
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

		System.out.printf("The customer's change is $ %.2f\n", changeDue);

		while (changeDue >= 0) {

			if (changeDue >= 100) {
				int oneHundredDollarBills = (int) (changeDue / hundreds);
				System.out.print("\nHundred Dollar Bills: " + oneHundredDollarBills + ", ");
				changeDue -= (hundreds * oneHundredDollarBills);

			} else if (changeDue >= 50) {
				int fiftyDollarBills = (int) (changeDue / fifties);
				System.out.print("\nFifty Dollar Bills: " + fiftyDollarBills + ", ");
				changeDue -= (fifties * fiftyDollarBills);
			}

			else if (changeDue >= 20) {
				int twentyDollarBills = (int) (changeDue / twenties);
				System.out.print("\nTwenty Dollar Bills: " + twentyDollarBills + ", ");
				changeDue -= (twenties * twentyDollarBills);

			} else if (changeDue >= 10) {
				int tenDollarBills = (int) (changeDue / tens);
				System.out.print("\nTen Dollar Bill: " + tenDollarBills + ", ");
				changeDue -= (tens * tenDollarBills);

			} else if (changeDue >= 5) {
				int fiveDollarBills = (int) (changeDue / fives);
				System.out.print("\nFive Dollar Bill: " + fiveDollarBills + ", ");
				changeDue -= (fives * fiveDollarBills);

			} else if (changeDue >= 1) {
				int oneDollarBills = (int) (changeDue / ones);
				System.out.print("\nOne Dollar Bills: " + oneDollarBills + ", ");
				changeDue -= (ones * oneDollarBills);

			} else if (changeDue >= .25) {
				int quarters = (int) (changeDue / twentyFiveCents);
				System.out.print("\nQuarters: " + quarters + ", ");
				changeDue -= (twentyFiveCents * quarters);

			} else if (changeDue >= .10) {
				int dimes = (int) (changeDue / tenCents);
				System.out.print("\nDimes: " + dimes + ",");
				changeDue -= (tenCents * dimes);

			} else if (changeDue >= .05) {
				int nickles = (int) (changeDue / fiveCents);
				System.out.print("\nNickle: " + nickles + ", ");
				changeDue -= (fiveCents * nickles);

			} else if (changeDue >= .01) {
				int pennies = (int) Math.round((changeDue / oneCents));
				System.out.print("\nPennies: " + pennies);
				changeDue -= ((oneCents * pennies) * 100);
			}

		}
	}

}
