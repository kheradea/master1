import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class nilesh1 {
  public static void main (String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		Actions a1=new Actions(d);
		a1.moveToElement(d.findElement(By.xpath("//input[@jsaction='paste:puy29d;']"))).click().keyDown(Keys.SHIFT).sendKeys("akash").doubleClick().keyUp(Keys.SHIFT).build().perform();
	a1.moveToElement(d.findElement(By.xpath("//a[@class='gb_A']"))).sendKeys(Keys.ENTER).build().perform();

  }
  
}
