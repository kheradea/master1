package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chrome_driver\\chromedriver.exe");
		WebDriver o1 = new ChromeDriver();
		o1.get("https://www.google.com/");
		WebElement search=o1.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		search.sendKeys("pune");
		Thread.sleep(1000);
		o1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]")).click();;
		
		
		
	}

}
