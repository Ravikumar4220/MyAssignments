package week2.day4.Assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		//Declare the input as Follow
  		String test = "I am a software tester"; 
        //split the words and have it in an array
		String[] split = test.split(" ");
  		//char[] charArray = test.toCharArray();
		//Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {
		//find the odd index within the loop (use mod operator)
		//split the words and have it in an array
		if (i%2!=0) {
		System.out.println( split[i]+" is a Odd Index");{
		String[] split2 = test.split(" ");
		//print the even position words in reverse order using another loop (nested loop)
		for (int j =split2.length-1; j>=0; j--) 
		if (j%2==0) {
		//Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		System.out.println(split2[j]+" is a even index");				
		}			
  	    }
	    }
	    }
        }
        }
