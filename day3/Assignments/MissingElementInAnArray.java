package week2.day3.Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		
		// Here is the input
		int[] array = {1,2,3,4,7,6,8};
		// Sort the array
		Arrays.sort(array);
		// loop through the array (start i from array[0] till the length of the array)
		for (int i =array.length-2; i >=0; i--) {
		// check if the iterator variable is not equal to the array values respectively
		if (i!=array.length) {
		// print the number
		System.out.println("Missing element is "+i);
		// once printed break the iteration
		break;
		}
	    }		
	    } 
        }
