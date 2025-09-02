package week3.day2;

public class TestData {
public void enterCredentials() {
	System.out.println("Enter Credentials");
}
public void navigateToHomePage() {
	System.out.println("Navigated");
}
public static void main(String[] args) {
	TestData t = new TestData();
	t.enterCredentials();
	t.navigateToHomePage();
}
}
