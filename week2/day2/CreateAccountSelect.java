package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) throws Exception {
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
		Drive.findElement(By.id("accountName")).sendKeys("Meenu 6");
		Drive.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement scanDD = Drive.findElement(By.name("industryEnumId"));
		Select select = new Select(scanDD);
		select.selectByIndex(3);
		WebElement scan2DD = Drive.findElement(By.name("ownershipEnumId"));
		Select select2 = new Select(scan2DD);
		select2.selectByVisibleText("S-Corporation");
		WebElement scan3DD = Drive.findElement(By.name("dataSourceId"));
		Select select3 = new Select(scan3DD);
		select3.selectByValue("LEAD_EMPLOYEE");
		WebElement scan4DD = Drive.findElement(By.id("marketingCampaignId"));
		Select select4 = new Select(scan4DD);
		select4.selectByIndex(7);
		WebElement scan5DD = Drive.findElement(By.id("generalStateProvinceGeoId"));
		Select select5 = new Select(scan5DD);
		select5.selectByValue("TX");
		Drive.findElement(By.className("smallSubmit")).click();
		System.out.println(Drive.findElement(By.xpath("//span[contains(text(),'Meenu')]")).getText());
		
		
		

	}

}
