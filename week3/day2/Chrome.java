package week3.day2;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("High speed");
	}
	public void clearCache() {
		System.out.println("catche clear");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openIncognito();
		c.clearCache();
		c.closeBrowser();
	}
}
