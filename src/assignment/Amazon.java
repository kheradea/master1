package assignment;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver o=new ChromeDriver();
		o.get("https://www.amazon.com/gp/navigation-country/select-country");
		List <WebElement> link=o.findElements(By.xpath("//a"));
		System.out.println("number of links as: "+ link.size());
		Iterator<WebElement> obj=link.iterator();
		
		while(obj.hasNext())
		{
			System.out.println(obj.next());
			
		}
	
		
	}

}
