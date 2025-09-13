package week4.day1;

public class Overloading {

	public void add() {
		System.out.println("Method Overtriding");
	}
	
	
	public void reportstep() {
	String msg ="Kindly check the message";
			String status = "Pass";
			System.out.println(msg);
			System.out.println(status);}


public void reportstep(String msg,String status,boolean snap) {
	 msg ="Kindly check the message";
	 status = "Fail";
	 snap = true;
	 System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
}
}