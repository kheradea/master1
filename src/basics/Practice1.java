package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver o1 = new ChromeDriver();
		o1.get("https://www.whatsapp.com/");
		Thread.sleep(1000);
		o1.navigate().back();
		o1.navigate().to("https://www.facebook.com/");
		o1.navigate().refresh();
		o1.manage().window().fullscreen();
		Thread.sleep(2000);
		o1.manage().window().maximize();
		String str1 = o1.getTitle();
		System.out.println(str1);
		String str2 = o1.getCurrentUrl();
		System.out.println(str2);
		String title = "Facebook – log in or sign up";
		String url = "facebook.com";
		if (str1.equals(title)) {
			System.out.println("title matched");
		} else {
			System.out.println("wrong title");
		}
		if (str2.equals(url)) {
			System.out.println("url matched");
		} else {
			System.out.println("wrong url");
		}
		o1.findElement(By.id("email")).sendKeys("akash");
		o1.findElement(By.cssSelector("input#email")).clear();
		o1.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("akash@123");
		o1.findElement(By.id("pass")).sendKeys("akash");
		Thread.sleep(1000);
		o1.findElement(By.cssSelector("div button")).click();
		Thread.sleep(1000);
		o1.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		o1.findElement(By.linkText("Cancel")).click();
		Thread.sleep(1000);
		o1.findElement(By.className("_97w5")).click();
		o1.findElement(By.name("firstname")).sendKeys("Akash");

		o1.findElement(By.name("lastname")).sendKeys("kherade");

		o1.findElement(By.name("reg_email__")).sendKeys("khe@gmail.com");
		o1.findElement(By.name("reg_passwd__")).sendKeys("Akash");
		Thread.sleep(1000);
		o1.findElement(By.cssSelector("Input[value='2']")).sendKeys(Keys.ENTER);
		o1.navigate().back();
		Thread.sleep(1000);
		o1.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(1000);
		System.out.println(o1.findElement(By.xpath("//button[text()='Log In']")).getText());
		o1.close();

	}

}
