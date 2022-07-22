package week1.day3;

public class MobilePhone {
	
	int ramSize=6;
	long imeiNumber=1234567890987654L;
	boolean isCharged=true;
	String brandName="Realme";
	String modelName="Realme 5Pro";
	double mobilePrice=15000.0D;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MobilePhone Phone=new MobilePhone();
	
    System.out.println("ramSize "+Phone.ramSize);
    System.out.println("imeiNumber "+Phone.imeiNumber);
    System.out.println("isCharged "+Phone.isCharged);
    System.out.println("brandName "+Phone.brandName);
    System.out.println("modelName "+Phone.modelName);
    System.out.println("mobilePrice "+Phone.mobilePrice);
	
	}

}
