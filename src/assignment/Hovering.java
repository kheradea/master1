package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver o = new ChromeDriver(op);
		o.get("https://www.flipkart.com/");
		o.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		List<WebElement> li = o.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div"));
		Actions a = new Actions(o);
		for (int i = 0; i <= li.size(); i++) {
			a.moveToElement(li.get(i)).perform();
			Thread.sleep(2000);
		}
	}
}
