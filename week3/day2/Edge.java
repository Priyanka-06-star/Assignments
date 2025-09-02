package week3.day2;

public class Edge extends Browser{
	public void takeSnap() {
		System.out.println("Screen shot is taken");
		
	}
	public void clearCookies() {
		System.out.println("cookies are cleared");
	}
	public static void main(String[] args) {
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.closeBrowser();
	}

}
