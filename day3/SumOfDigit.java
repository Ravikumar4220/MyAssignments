package week2.day3;

public class SumOfDigit {
	public static void main(String[] args) {
		
		    int num=12345;
            int a=0;
            while (num>0) {
        	int remainder=num%10;
        	a=a+remainder;
           	num=num/10;
        			
		}	
            System.out.println(a);
	}
}
