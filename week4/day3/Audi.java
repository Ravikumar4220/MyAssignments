package week4.day3;

public class Audi extends TwoWheeler {
	public void stopCar() {
		System.out.println("StopCar");
}
	public static void main(String[] args) {
		Audi car=new Audi();
		car.applyGear();
		car.startCar();
		car.applyBreak();
		car.stopCar();
	}
}
