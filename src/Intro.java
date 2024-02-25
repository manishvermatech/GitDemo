import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Intro {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:/Software/ChromeDriver/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println("Git Demo Practise ");
driver.close();
 
	}

}


