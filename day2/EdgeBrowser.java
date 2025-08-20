package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser lb = new Browser();
		String name = lb.launchBrowser("Chrome");
		System.out.println(name);
		String url = lb.loadUrl("https://platform.testleaf.com/#/");
		System.out.println(url);
		System.out.println("Browser loaded successfully");
		}

}
