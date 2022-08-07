package week2.day4;

public class StringLearn {
	public static void main(String[] args) {
		
		String name="Welcome to Chennai";
		int count=0;
		char[] chararray=name.toCharArray();
		for (int i = 0; i < chararray.length; i++) {
		//System.out.println(chararray[i]);
		if (chararray[i]=='n') {
		count=count+1;		
		}
	   }
		System.out.println(count);
		}
	   }


