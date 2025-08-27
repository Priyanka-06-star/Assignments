package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver Drive = new ChromeDriver(options);
		Drive.get("http://leaftaps.com/opentaps/control/main");
		Drive.manage().window().maximize();
		Drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		Drive.findElement(By.id("password")).sendKeys("crmsfa");
		Drive.findElement(By.className("decorativeSubmit")).click();
		Drive.findElement(By.partialLinkText("CRM")).click();
		//Drive.findElement(By.xpath("//a[text()='Accounts']")).click();
		Drive.findElement(By.partialLinkText("Accounts")).click();
		Drive.findElement(By.linkText("Create Account")).click();
		Drive.findElement(By.id("accountName")).sendKeys("Priyanka S");
		Drive.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Drive.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		Drive.findElement(By.className("smallSubmit")).click();
		

	}

}
