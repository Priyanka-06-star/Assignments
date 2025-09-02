package week3.day2;

public class LoginTestData extends TestData{
public void enterUsername() {
	System.out.println("User name entered");
}
public void enterPassword() {
	System.out.println("password entered");
}
public static void main(String[] args) {
LoginTestData d = new LoginTestData();
d.navigateToHomePage();
d.enterUsername();
d.enterCredentials();
d.enterPassword();
}
}
