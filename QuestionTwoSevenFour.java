package questionTwoProj;

import java.util.Scanner;

public class QuestionTwoSevenFour {

// Algorithm from question 2.7.4
	public static int questionTwoMeth(int n) {

		int i = 0, j= 0;
		int sum = 0;

		for(i = 0; i < n; i++) {
			for(j=0; j<i; j++) {
				sum++;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		// Starts the runtime clock


		Scanner scnr = new Scanner(System.in);
		int mainN = 0;

		System.out.print("Enter a sample size for your algorithm, n = ");
		mainN = scnr.nextInt();
		long startTime = System.nanoTime();

		System.out.println("Sum: " + questionTwoMeth(mainN));

		scnr.close();

		// Prints runtime clock to 5 decimals, in ns

		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Runtime in nanoseconds: " + totalTime + ".");

		return;


	}

}
