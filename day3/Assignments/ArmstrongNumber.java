package week2.day3.Assignments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		// Declare your input
		int inputs=153;
		// Assign input into variable original 
		int Armsnumber=0;
		int a=inputs;
		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while (inputs>0) {
		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
		int Remainder=inputs%10;
		// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
	    inputs=inputs/10;
	    // Within loop: Add calculated with the cube of remainder & assign it to calculated
	    Armsnumber=Armsnumber+(Remainder*Remainder*Remainder);
        // Check whether calculated and original are same
		if (a==Armsnumber) {
	    //When it matches print it as Armstrong number
		System.out.println(Armsnumber+" is a ArmsStrong Number");	
		}
	    }
	    }
        }
