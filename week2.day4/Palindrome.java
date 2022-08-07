package week2.day4;

public class Palindrome {
	
	public static void main(String[] args) {	
		String name1="madam";
		String reverse="";
		char[] chararray=name1.toCharArray();
		for (int i =chararray.length-1; i>=0; i--) {
		reverse=reverse+chararray[i];
		System.out.println(reverse);	
		}
		if (reverse.equals(name1)) {
			System.out.println(reverse+" is a Palindrome");
		}
		}
	}


