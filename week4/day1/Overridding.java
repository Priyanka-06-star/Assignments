package week4.day1;

public class Overridding extends Overloading {
	public void add() {
		System.out.println("Method Overtriding1");
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.reportstep();
		ol.reportstep("Kindly check the message", "Fail", false);
		Overridding ol1 = new Overridding();
		ol1.add();
	}
}
