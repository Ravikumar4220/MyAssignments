package week2.day3.Assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input=13;
		// Declare a boolean variable flag as false
		boolean isPrime=false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <13/2; i++) {
		// Divide the input with each for loop variable and check the remainder
		if (i%2==0) {
		// Set the flag as true when there is no remainder
		isPrime=true;
		// break the iterator
		break;
		}	
		}
		if (isPrime) {
		// Print 'Prime' when the condition matches
		System.out.println(input+" is a PrimeNumber");
		}
		// Print 'Not a Prime' when the condition doesn't match 
		else {
		System.out.println(input+" is not a PrimeNumber");
		}
	    }
}

