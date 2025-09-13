package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.messages.types.Duration;

public class Collections {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> allprice = driver.findElements(By.className("a-price-whole"));
	int allrate = allprice.size();
	System.out.println(allrate);
	for (WebElement allte : allprice) {
		String alltext = allte.getText();
		System.out.println(alltext);
	}
	
	

	

}
}
