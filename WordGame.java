/*
 * Travis White
 * 11/7/2019
 * Programming assignment one
 * WordGame
 * Description: This program takes input from the user and enters this information into a predetermined story.
 * 
 */
import java.util.Scanner;
import java.lang.String;


public class WordGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userName; 
		int userAge;
		String userCity;
		String userCollege;
		String userProfession;
		String userAnimal;
		String userPet;
		
		// Asks user for input and gets input with scanner object 
		
		System.out.print("Enter your name: ");
		userName = input.nextLine();
		
		System.out.print("\nEnter your age: ");
		userAge = input.nextInt();
		
		System.out.print("\nEnter the name of a city: ");
		userCity = input.next();
		
		System.out.print("\nEnter the name of a college: ");
		userCollege = input.next();
		
		System.out.print("\nEnter a profession: ");
		userProfession = input.next();
		
		System.out.print("\nEnter a type of animal: ");
		userAnimal = input.next();
		
		System.out.print("\nEnter the name of a pet: ");
		userPet = input.next();
		
		// Print story one
		
		System.out.println("\nData collected.\nPrinting story one...");
		
		System.out.println("\nStory one:");
		System.out.println("There once was a person named " + userName + 
				" who lived in " + userCity + ".\nAt the age of " + userAge + ", " + userName + 
				" went to college at " + userCollege + ". \n"  + userName + " graduated and went to work as a " 
				+ userProfession+ ".\nThen, " + userName + " adopted a(n) " + userAnimal + " named " + userPet +  
				". \nThey both lived happily ever after!");
		
		// Print story two
		
		System.out.println("\nStory two:");
		System.out.println("The main character of this story is " + userName + ".\n" +
				userName + " is " + userAge + " years old.\n" +
				userName + "'s favorite city is " + userCity + ". \n" +
				userName + "'s favorite college football team is " + userCollege + ". \n" +
				userName + " would like to be a " + userProfession + 
				" when (s)he finishes school.\n" +
				userName + "'s favorite animal is the " + userAnimal + ".\n" +
				"If " + userName + " had a " + userAnimal + " (s)he would name it " + userPet + ".\n");
			
		
		
		
		// Close the scanner
		input.close();

	} // Ends main

} // Ends class WordGame

