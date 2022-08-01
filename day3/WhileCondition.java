package week2.day3;

public class WhileCondition {
	public static void main(String[] args) {
		
		int i=1;
		
		while (i<=50) {
			if (i%2==0) {
				System.out.println(i+"Even");
			}
			else {
				System.out.println(i+"Odd");
			}
			i++;
		}
	}

}
