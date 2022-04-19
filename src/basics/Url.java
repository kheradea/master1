package basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Url {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver o1=new ChromeDriver();
		o1.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		o1.navigate().to("https://www.google.com/");
		
		Wait<WebDriver> w1=new <WebDriver>FluentWait(o1).withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement obj=w1.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver o1) {
				if(o1.findElement(By.xpath("//input[@title='Search']")).isDisplayed())
				{
					return o1.findElement(By.xpath("//input[@title='Search']"));
				}
				else
					return null;
		
		}
		
		});
		
		
		o1.findElement(By.xpath("//input[@title='Search']")).sendKeys("pune");
		List <WebElement> list= o1.findElements(By.xpath("//div[@class='aajZCb']//li//div[@class='wM6W7d']//span"));
		for(WebElement option:list)
		{
		
			System.out.println(option.getText());
		}

	}

}
