import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Practice1 {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://pmkisan.gov.in/");
		d.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']//li//a[text()=' CSC Login']")).click();
		
		Set<String> set=d.getWindowHandles();
		Iterator <String> i=set.iterator();
		String parentId=i.next();
		String childId=i.next();
		d.switchTo().window(childId);
//		d.findElement(By.xpath("//a[@href='NewHome3.aspx']")).sendKeys(Keys.ENTER);
		Set <String> ak=d.getWindowHandles();
//		String parent= d.getWindowHandle();
		
	
		Iterator<String> it=ak.iterator();
		String parent=it.next();
		String child=it.next();

		d.switchTo().window(child);
		JavascriptExecutor exe=(JavascriptExecutor) d;
		exe.executeScript("window.scrollBy(0,900)");
		
//		exe.executeScript("alert('Welcome');");
		
	System.out.println(exe.executeScript("return document.domain;"));
	System.out.println(exe.executeScript("return(document.url);"));
	exe.executeScript("document.querySelector('div#MainContent').style.backgroundColor='Red'");
	exe.executeScript("document.querySelector('div.panel.panel-default div[style='height: 500px; overflow: auto;']').scrollTop('500')");
	exe.executeScript("alert('akash';)");
	
	


}
}
