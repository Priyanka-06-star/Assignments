package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Test leaf");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("Raji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead of CSE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ABC@gmail.com");
		Thread.sleep(1000);
		WebElement demoD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select1=new Select(demoD);
		select1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Lead to IT");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		

	}

}
