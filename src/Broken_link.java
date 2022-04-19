import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_link {
	public static void main(String[] args) throws  IOException {
		
			System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			SoftAssert a=new SoftAssert();
			d.get("https://www.w3schools.com/html/html_tables.asp");
			List<WebElement> list=d.findElements(By.xpath("//*[@id=\"topnav\"]/div/div[1]//a"));
			for(WebElement a1:list)
			{
				String url=a1.getAttribute("href");
				HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int code=conn.getResponseCode();
				if(code>400)
				{
					System.out.println(url);
					a.assertTrue(false);
			
				}
				a.assertAll();
			}
	}

}
