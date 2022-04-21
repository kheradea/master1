package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static LogInPage lp;
	public static void LaunchURL()
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	driver=new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");
	lp=new LogInPage(driver);
	}

}
