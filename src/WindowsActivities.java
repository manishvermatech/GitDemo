import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:/Software/ChromeDriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		

	}

}
