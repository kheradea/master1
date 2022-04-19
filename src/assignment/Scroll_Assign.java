package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JavaScriptExecutor;

public class Scroll_Assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://pmkisan.gov.in/CSC/Home.aspx");
	JavaScriptExecutor.scroll(d, 0, 500);
	Thread.sleep(2000);
	WebElement location=d.findElement(By.xpath("//*[@id=\"myCarousel\"]/a[2]"));
		JavaScriptExecutor.scrollView(d, location);
		Thread.sleep(2000);	
	}

}
