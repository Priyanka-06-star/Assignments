package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
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
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);

		//String Firstlead=driver.findElement(By.xpath("//tbody//td[1]//a[1][contains(text(),'DemoLead1')]")).getText();
		String Firstlead=driver.findElement(By.xpath("//div[@id='findLeads']//div//div[3]//div[2]//div[2]//div[1]//div[1]//tr[1]//td[1]//a[1]")).getText();
		System.out.println(Firstlead);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='findLeads']//div//div[3]//div[2]//div[2]//div[1]//div[1]//tr[1]//td[1]//a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Firstlead);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.quit();
		
		
		
		
		
		
		

	}

}
