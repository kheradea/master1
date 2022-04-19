import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nileshtest1 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		ChromeOptions a1 = new ChromeOptions();
		
		a1.addArguments("--start-maximized");
		a1.addArguments("--incognito");
		a1.addArguments("--disable-notifications");
//		a1.addArguments("--headless");
	
		WebDriver o1=new ChromeDriver(a1);
		o1.get("https://www.google.co.in/");
		
	}

}
