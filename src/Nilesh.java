import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Nilesh {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pmkisan.gov.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Wait <WebDriver> wait=new <WebDriver>FluentWait(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		WebElement s1=wait.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.xpath(" (//a[@href='/CSC/Home.aspx'])[1]")).isEnabled())
				{
					return driver.findElement(By.xpath(" (//a[@href='/CSC/Home.aspx'])[1]"));
				}
				else 
					return null;
				
			}
				});
		
		driver.findElement(By.xpath(" (//a[@href='/CSC/Home.aspx'])[1]")).click();
		driver.close();
//	driver.quit();
		
		
		
	

		
	}
	

}
