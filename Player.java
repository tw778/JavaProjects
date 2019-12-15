public class Player {
	
private String name;
private String position;
private double yards;
private boolean isDefensive;

@SuppressWarnings("unused")
private Player() {

	name = "NoName";
	position = "NoPos";
	yards = -1;
	isDefensive = false;
	
}
// Constructor for Player objects
public Player(String inputName, String inputPosition, double inputYards, boolean inputIsDefensive) {
	name = inputName;
	position = inputPosition;
	yards = inputYards;
	isDefensive = inputIsDefensive;
}

// The following methods return user info and are used in case 2 in the switch statement. Used to examine whats in the roster
public String getName() {
	return name;
}

public String getPosition() {
	return position;
}

public double getYards() {
	return yards;
}

public boolean hasDefensivePos(){
	return isDefensive;
}
	
} // Class ends here
