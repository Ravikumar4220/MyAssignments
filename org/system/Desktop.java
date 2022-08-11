package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("7th Gen Ci5/ 8GB/ 1TB/ Win10");
	}
	public static void main(String[] args) {
		Desktop com=new Desktop();
		com.computerModel();
		com.desktopSize();
	}
}
