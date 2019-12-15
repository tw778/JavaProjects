/*
 * Travis White
 * 11/7/2019
 * Programming assignment one
 * HotDogCookoutCalculator
 * Description: This program takes user input and calculates various metrics for preparing for a hotdog cookout.
 * NOTE: I used some material from future chapters to make the program more robust.
 */

import java.util.Scanner;

public class HotDogCookoutCalc {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numPeople;
		int numDogsPerPerson;
		double totalDogsEaten;
		double bunsLeftOver;
		double dogsLeftOver;
		double bunsRequired;
		double dogsRequired;
		final double BUNS_IN_PACKAGE=8;
		final double DOGS_IN_PACKAGE=10;
		
		
		System.out.println("Welcome to the Hotdog Cookout Calculator!");
		
		System.out.println("How many people are coming to your cookout? Enter an integer: ");
		numPeople = input.nextInt();
		
		System.out.println("How many hotdogs does will each person eat? Enter an integer: ");
		numDogsPerPerson = input.nextInt();
		
		// Calculate number of hotdogs eaten
		totalDogsEaten = numPeople * numDogsPerPerson;
		
		// Calculate number of hot dog packages required
		
		/*
		 * This branch ensures at least one package of hotdogs is purchased, in case there is less than
		 * 10 hotdogs eaten ( you can't buy a partial pack of hotdogs). Math.ceil rounds up any decimal
		 * to the next whole number.
		 * 
		 */
		dogsRequired = (totalDogsEaten / DOGS_IN_PACKAGE);
		if (totalDogsEaten < DOGS_IN_PACKAGE){
			dogsRequired = 1;
		}
		if ((dogsRequired % 1) != 0){
			dogsRequired = Math.ceil(dogsRequired);
		}
		
		// Calculate number of buns required

		/*
		 * This branch ensures at least one package of buns is purchased, in case there is less
		 * than 8 hotdogs eaten. Math.ceil rounds up any number in case there is a decimal (You can't buy partial packages of buns).
		 */
		
		bunsRequired = (totalDogsEaten / BUNS_IN_PACKAGE);
		if (totalDogsEaten < BUNS_IN_PACKAGE) {
			bunsRequired = 1;
		}
		if ((bunsRequired % 1) != 0){
			bunsRequired = Math.ceil(bunsRequired);
		}
		
		// Calculate number of left over hotdogs
		/*
		 * I used branches here to avoid negative numbers. If the number of dogs eaten is less than
		 * the amount of dogs in the package, dogs eaten are subtracted. This applies to the statement
		 * for buns left over as well.
		 */
		if (totalDogsEaten < DOGS_IN_PACKAGE) {
			dogsLeftOver = DOGS_IN_PACKAGE - totalDogsEaten;
		}
		else {
			dogsLeftOver = (DOGS_IN_PACKAGE * dogsRequired) - totalDogsEaten;
		}
		// Calculate number of left over buns
		
		if (totalDogsEaten < BUNS_IN_PACKAGE) {
			bunsLeftOver = BUNS_IN_PACKAGE - totalDogsEaten;
		}
		else {
			bunsLeftOver = (BUNS_IN_PACKAGE * bunsRequired) - totalDogsEaten;
		}
		
		System.out.println("Results: ");
		
		System.out.println("The minimum number of packages of hot dogs required: " + dogsRequired);
		
		System.out.println("The minimum number of packages of buns required: " + bunsRequired);
		
		System.out.println("The number of hot dogs that will be left over: " + dogsLeftOver);
		
		System.out.println("The number of buns that will be left over: " + bunsLeftOver);
		
		// Close the scanner object 
		input.close();
		
	} // Main ends here

} // Class HotDogCookoutCalc ends here
