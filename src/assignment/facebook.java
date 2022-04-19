package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver o1 = new ChromeDriver();
		o1.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		o1.get("https://mbasic.facebook.com/");
		o1.findElement(By.name("sign_up")).click();
		WebDriverWait w=new WebDriverWait(o1,1);
		w.until(ExpectedConditions.elementToBeClickable(o1.findElement(By.name("firstname"))));
		o1.findElement(By.name("firstname")).sendKeys("Shree");
		o1.findElement(By.name("lastname")).sendKeys("Pawar");
		o1.findElement(By.name("reg_email__")).clear();
		o1.findElement(By.name("reg_email__")).sendKeys("9763403971");
		o1.findElement(By.xpath("//tr//label//input[@value='2']")).click();
	
		WebElement obj1= o1.findElement(By.name("birthday_day"));
		
		Select s1=new Select(obj1);
		s1.selectByVisibleText("1");
WebElement obj2= o1.findElement(By.name("birthday_month"));
Thread.sleep(1000);
		Select s2=new Select(obj2);
		s2.selectByVisibleText("Jan");
WebElement obj3= o1.findElement(By.name("birthday_year"));
Thread.sleep(1000);
		Select s3=new Select(obj3);
	
		s3.selectByVisibleText("2000");
	
		o1.findElement(By.name("reg_passwd__")).sendKeys("Shree@123");
		
		o1.findElement(By.id("signup_button")).click();

		Thread.sleep(1000);
		o1.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	}	



