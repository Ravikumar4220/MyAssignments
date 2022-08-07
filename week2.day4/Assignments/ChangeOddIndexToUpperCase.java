package week2.day4.Assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		 //Declare String Input as Follow
		 //String test = "changeme";
		 String test = "changeme";
		 //Convert the String to character array
		 char[] charArray = test.toCharArray();
		//Traverse through each character (using loop)
		 for (int i = 0; i < charArray.length; i++) {
		//find the odd index within the loop (use mod operator)
		 if (charArray[i]%2!=0) {
		 System.out.println(charArray[i]+" String is odd index");
		//within the loop, change the character to uppercase, if the index is odd else don't change
		 String upperCase = test.toUpperCase();	 
		 System.out.println(upperCase);
		}
	   }
	  }
     }
