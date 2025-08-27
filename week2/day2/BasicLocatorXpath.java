package week2.day2;

import org.apache.xmlbeans.XmlFactoryHook.ThreadContext;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.findElement(By.xpath("//a [text()='Find your account and log in.']")).click();
			String title =driver.getTitle();
			System.out.println(title);


	}

}
