package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("priya");
			driver.findElement(By.name("lastname")).sendKeys("s");
			driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("Abcd@123456");
			WebElement demoDD = driver.findElement(By.name("birthday_day"));
			Select select1 = new Select(demoDD);
			select1.selectByIndex(5);
			WebElement demoD = driver.findElement(By.name("birthday_month"));
			Select select2 = new Select(demoD);
			select2.selectByIndex(7);
			WebElement demo = driver.findElement(By.name("birthday_year"));
			Select select3 = new Select(demo);
			select3.selectByVisibleText("2024");
			//driver.findElement(By.xpath("//label[contains(text()='Female')"));
			//driver.findElement(By.id("sex")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[contains(text(),'Female')]/input[@id='sex']")).click();
			
			
	}

}
