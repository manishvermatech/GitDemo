import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
// Sibling -Parent  Traverse
public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Software/ChromeDriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]")).getText();

	}

}
