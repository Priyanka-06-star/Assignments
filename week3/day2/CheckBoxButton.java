package week3.day2;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("click the button and check");
	}
	public static void main(String[] args) {
		CheckBoxButton c = new CheckBoxButton();
		c.click();
		c.clickCheckButton();
		
		
	}
	
}
