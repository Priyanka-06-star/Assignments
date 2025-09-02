package week3.day2;

public class Button extends WebElement {
public void submit() {
	System.out.println("Click to submit");
}
public static void main(String[] args) {
	Button b = new Button();
	b.gettext("get the text from portal");
	//b.submit();
	
}
}
