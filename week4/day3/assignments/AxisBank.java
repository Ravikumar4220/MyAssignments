package week4.day3.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Axis Bank");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}
}
