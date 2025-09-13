package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags");
		Thread.sleep(5000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='desktop-searchBar']")).click();
		driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']")).click();
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[5]")).click();
		Thread.sleep(1000);
		String totalitems =driver.findElement(By.xpath("//span[@class ='title-count']")).getText();
		System.out.println("Bag" +totalitems);
		List <WebElement> Brands =driver.findElements(By.className("brand-list"));
		//String Allbrands =Brands.get(0).getText();
		for (WebElement iter : Brands) {
			String Allbrands=iter.getText();
			System.out.println(Allbrands);
		}
		

	}

}
