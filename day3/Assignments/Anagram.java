package week2.day3.Assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		//Declare a String 
		//String text1 = "stops";
		String text1="stops";
	    //Declare another String
		//String text2 = "potss"; 
		String text2="potss";
		//Check length of the strings are same then (Use A Condition)
		if  (text1.length()==text2.length()) {
		System.out.println("Length of the strings are same");	
		}
		//Convert both Strings in to characters	
		char a[]=text1.toCharArray();
		char b[]=text2.toCharArray();
		//Sort Both the arrays
		Arrays.sort(a);
		Arrays.sort(b);
	    //Check both the arrays has same value
		boolean result=Arrays.equals(a, b);
		if (result==true) {
		System.out.println("Strings are Anagram");
		}
		else {
		System.out.println("Strings are not Anagram");
		}	
	    }
	    }
