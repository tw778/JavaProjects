package binarySearchProj;

import java.util.Scanner;

/*
 * Travis White CIS322
 * I decided to code this up and include it with the pseudocode for part 3. It seems to work when I run it.
 */

public class BinarySearchAi {


	public static boolean binarySearch(int[] A, int key) {

		int min = 1;
		int max = A.length-1;

		do {
		int mid = (min + max) /2;

		if ((mid == key) && (key == A[mid])){
			return true;
		}
		else if(key < mid) {
			max = mid - 1;
		}
		else if(key > mid) {
			min = mid + 1;
		}
		else {
			return false;
		}
		} while (min <= max);

return false;

	}

	public static void main(String[] args) {


		int key = 0;
		int [] A = new int [] {0,2,2,3,4,5,6,7,8,9,10};

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the key: ");
		key = scnr.nextInt();

		boolean value = binarySearch(A,key);

		if (value == true) {

			System.out.println("Key found at the proper position!");
		}
		else {
			System.out.println("Key was not found :(");
		}

		scnr.close();

		return;

	}

}
