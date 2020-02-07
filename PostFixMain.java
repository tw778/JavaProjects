import java.util.Scanner;

/*
 * Travis White CIS322
 * HW2 Question 3.22
 * Required classes (attached):
 * PostFixMain.java
 * StackPost.java
 * StringList.java
 */

public class PostFixMain {

	public static void main(String[] args) {

	// Declare 2 separate lists: one for doubles, one for strings (operators)
	StringList stringList = new StringList();
	StackPost list = new StackPost();

	// User input here. Spaces are ignored, equals is ignored
	String s = "10 20 3 * / =";

	// Scanner extracts doubles and operators from user input
	Scanner scnr = new Scanner(s);
	String parse = null;
	double d;
	double stack1;
	double stack2;

	// Increment the operators to ensure order of operations in maintained during arithmetic
	int numAdd = 0;
	int numSub = 0;
	int numMult = 0;
	int numDiv = 0;
	int totalOp = 0;

	while(scnr.hasNext()) {

		parse = scnr.next();

		if (isNumeric(parse)) {
			d = Double.parseDouble(parse);
			list.push(d);
		}
		else  {
			stringList.push(parse);
		}


	}

// This while loop pops the string list, and increments the occurrences of each operation to be used later
	while (stringList.head != null) {
		s = stringList.stackPop().data;
		if (s.equals("+")) {
			++numAdd;
			++totalOp;
		}
		else if (s.equals("-")) {
			++numSub;
			++totalOp;
		}
		else if (s.equals("*")) {
			++numMult;
			++totalOp;
		}
		else if (s.equals("/")) {
			++numDiv;
			++totalOp;
		}

	}

/*
 * This while loop ensures the order of operations is maintained. It decrements the total operations as it goes.
 */

	while (totalOp != 0) {
		if (numMult > 0) {
			stack1 = list.stackPop().data;
			stack2 = list.stackPop().data;
			list.push(stack1 * stack2);
			--numMult;
			--totalOp;
		}
		else if (numDiv > 0) {
			stack1 = list.stackPop().data;
			stack2 = list.stackPop().data;
			list.push(stack1 / stack2);
			--numDiv;
			--totalOp;
		}
		else if (numAdd > 0) {
			stack1 = list.stackPop().data;
			stack2 = list.stackPop().data;
			list.push(stack1 + stack2);
			--numAdd;
			--totalOp;
		}
		else if (numSub > 0) {
			stack1 = list.stackPop().data;
			stack2 = list.stackPop().data;
			list.push(stack1 - stack2);
			--numSub;
			--totalOp;
		}


	}

// Print the result (what is left in the stack)
	System.out.print("Result: ");
	StackPost.printList(list);

	// Close the scanner

	scnr.close();

	} // Main ends here

// This method checks to see if the string is numeric. Returns a boolean.
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

}
