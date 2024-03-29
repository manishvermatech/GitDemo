import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String  name ="rahul"  ; 
		System.setProperty("webdriver.chrome.driver","C:/Software/ChromeDriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assertion is used from Test NG and compare the execpted v/s actul  result
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+name+",");
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		
			}
	
	public void getPassword(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

}
