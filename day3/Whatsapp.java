package week1.day3;

public class Whatsapp {
 
	public void sendText() {
		System.out.println("Send Text");
	}
	private void whatsappCall() {
		System.out.println("Whatsapp Call");
	}
	protected void makePayment() {
		System.out.println("Make Payment");
	}
	void useEmoji() {
		System.out.println("Use Emoji");
	}
	public static void main(String[] args) {
		
		Whatsapp app1=new Whatsapp();
		app1.sendText();
		app1.whatsappCall();
		app1.makePayment();
		app1.useEmoji();
		
	}
	
	
}
