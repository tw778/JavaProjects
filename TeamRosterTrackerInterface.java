
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Travis White
 * 12/1/2019
 * Programming assignment two
 * Team Roster tracker interface
 * 
 * This program takes user input to create a football roster. It can retrieve player info once the roster is created.
 * It can save as a text file (default to D drive). The text file can be reloaded into the program and that information can be retrieved.
 * Deleting information is not supported.
 * 
 */

public class TeamRosterTrackerInterface {

public static void main(String[] args) throws IOException {

	// Declare variables, create objects
Scanner scnr = new Scanner(System.in);
		
	// Calling the menuPrompt method starts interaction with the user
		menuPrompt();
		int choice = scnr.nextInt();
		scnr.nextLine();
		char choiceDefense;
		boolean isDefensive = false;
		String name = "NoName";
		String position = "NoPos";
		double yards = -1;
		FootballRoster Roster = new FootballRoster();
		FootballRoster Roster2 = new FootballRoster();
		int index = 0;
		boolean isLoaded = false;
		
	// The user picks an option after being prompted by the menuPrompt function, the choice will be entered into this switch/do while loop
		do {
		switch(choice){
		
		case 1: 
			
			// Case one adds a player to the roster
			
			System.out.println("Enter the player's name: ");
			name = scnr.nextLine();
			System.out.println("Enter the player's position: ");
			position = scnr.nextLine();
			System.out.println("Enter the player's total yardage: ");
			yards = scnr.nextDouble();
			System.out.println("Does the player play defense (y/n): ");
			
			do {
				choiceDefense = (char) System.in.read(); 
				
				if (choiceDefense == 'y') {
					isDefensive = true;	
					break;
				}else {
					isDefensive = false;
					break;
				}
			} while((choiceDefense != 'y') || (choiceDefense != 'n'));
			Player newItem = new Player(name, position, yards, isDefensive); // Creates a new Player object with the userInput
			Roster.addPlayer(newItem);
			
			System.out.println("\nPlayer added!\nReturning to main menu... \n");
			
			// Sends the user back to the main menu automatically, they can add, retrieve, save or exit
			menuPrompt();
			choice = scnr.nextInt();
			scnr.nextLine();

			break;
			
			
		case 2:
		/*
		 * This case retrieves player info from a loaded/created roster. If it is a loaded roster, this case will
		 * retrieve data from the appropriate array.
		 * 
		 */
			System.out.println("Which player would you like to view? Enter an integer: ");
			index = scnr.nextInt();
			scnr.nextLine();
			if (isLoaded == false) {
			System.out.println("Viewing player info for player number: " + index);
			System.out.println("==================");
			System.out.println("Name: " + Roster.getPlayer(index).getName());
			System.out.println("Position: " + Roster.getPlayer(index).getPosition());
			System.out.println("Total yards: " + Roster.getPlayer(index).getYards());
			System.out.println("Plays defense?: " + Roster.getPlayer(index).hasDefensivePos());
			System.out.println("==================");
			}
			else {
				System.out.println("Viewing player info for player number: " + index);
				System.out.println("==================");
				System.out.println("Name: " + Roster2.getPlayer(index).getName());
				System.out.println("Position: " + Roster2.getPlayer(index).getPosition());
				System.out.println("Total yards: " + Roster2.getPlayer(index).getYards());
				System.out.println("Plays defense?: " + Roster2.getPlayer(index).hasDefensivePos());
				System.out.println("==================");
			}
			
			menuPrompt();
			choice = scnr.nextInt();
			scnr.nextLine();
			break;
			
			// Save to output txt file
		case 3:
			// See description in the FootballRoster class
			Roster.saveRosterToFile();
			System.out.println("====FILE SAVED====");
			
			menuPrompt();
			choice = scnr.nextInt();
			break;
			
			// Load file and input data
		case 4:
		// See description in FootballRoster class
			Roster.loadRosterFromFile();
			System.out.println("====FILE LOADED====");
			Scanner scnr2 = new Scanner(new File("D:\\output1.txt"));
			// Loop that adds new Players into an array with information from the text file
			while (scnr2.hasNextLine()) {
				for (int j = 0; j < 4; ++j) {
				if (scnr2.hasNextLine() != false){
				
				name = scnr2.nextLine();
				position = scnr2.nextLine();
			    yards = scnr2.nextDouble();
				isDefensive = scnr2.nextBoolean();
				scnr2.nextLine();
				
				Player newItem2 = new Player(name, position, yards, isDefensive);
				Roster2.addPlayer(newItem2);
					
				}
			}
				
		}
			scnr2.close();
			isLoaded = true;
			menuPrompt();
			choice = scnr.nextInt();
			
			break;
			
		case 5:
			// Exit the program, close the scanner object
			System.out.println("Exiting...");
			scnr.close();
			return;
		
		default:
			// If the user provides a choice that is not 1-5 this case will send them back to the menu with an error message.
			System.out.println("Your entry is invalid. Please enter a digit 1-5.");
			menuPrompt();
			choice = scnr.nextInt();
			break;
			
	 } 
		}while (choice != 5); // Part of the do while loop for the user interface. It will continue to loop until they enter 5.
		
		scnr.close();
		
} // Main ends here
	
	// Function declarations
	// This method describes the options that they can choose
	public static void menuPrompt(){
		
		System.out.println("FOOTBALL TEAM ROSTER GENERATOR\n");
		System.out.println("Main Menu: ");
		System.out.println("1: Add a new player to your roster ");
		System.out.println("2: Get player info from your roster ");
		System.out.println("3: Save roster to file ");
		System.out.println("4: Load roster from file ");
		System.out.println("5: Exit \n");
		System.out.print("Enter the digit (1-5) that corresponds with your choice: ");
		}	
	
}// Class ends here

