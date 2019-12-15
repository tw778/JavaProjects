import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class FootballRoster {
	
	private int totalPlayers = 0;
	private Player[] rosterArray = new Player[1000];
	
// Default constructor
public FootballRoster() {
	
}

public int getTotalPlayers() {
	return totalPlayers;
}
// Checks to see if the index really exists, returns info from desired array position if it does
public Player getPlayer(int index) {
	
	if ((index < 0) || (index >= totalPlayers)) {
		return null;
	}
	else 
	{
		return rosterArray[index];
	}
	
	
}
// Adds the player info into the Roster object, increments the amount of total players by one
public void addPlayer(Player newItem){
	
	if (newItem == null) {
		System.out.println("Player not added.");
	}
	else {
		rosterArray[totalPlayers] = newItem;
		totalPlayers = totalPlayers + 1;
		
	}
}

public void saveRosterToFile() throws FileNotFoundException{
     	// Saves array info into a text file. Name/path of output can be changed below.
		int i;
     	
		PrintWriter writer1 = null;      
        writer1 = new PrintWriter(new File("D:\\output1.txt"));  // Change file name or path here, use this same format
        for (i=0; i < totalPlayers; ++i){
        
        writer1.write(rosterArray[i].getName()+ "\n"); 
        writer1.write(rosterArray[i].getPosition()+ "\n");
        writer1.print(rosterArray[i].getYards() + "\n");
        writer1.print(rosterArray[i].hasDefensivePos()+ "\n");
       
                        writer1.flush();  
        }
        writer1.close();  
}

public void loadRosterFromFile() throws FileNotFoundException{
	// Sets total players to 0, a Scanner object is used within case 4 to load the text file into an array
	totalPlayers = 0;
	
	
	
	

}


} // Class ends here
