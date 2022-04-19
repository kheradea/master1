import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Https_certifications {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		ChromeOptions a1 = new ChromeOptions();
		a1.setAcceptInsecureCerts(true);
		WebDriver o1=new ChromeDriver(a1);
		o1.get("https://expired.badssl.com/");
		
	}


}
