import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Software/ChromeDriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Manish");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("TBD");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Manishv");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234576567");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Manish");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		
		
			
		
	}

}
