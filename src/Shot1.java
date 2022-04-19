import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.ScreenShot;

public class Shot1 {
	
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.whatsapp.com/");
			Thread.sleep(2000);
			WebElement source=driver.findElement(By.xpath("//*[@id='content-wrapper']/div/section/div/div/div[2]/picture/img"));
			File target=new File("G:\\java notes\\screenshot\\sc.png");
			ScreenShot s=new ScreenShot();
			Thread.sleep(2000);
			s.screenshotAs(driver, source, target);
//			driver.get("https://pmkisan.gov.in/");
//			Thread.sleep(2000);
//			WebElement sc1=driver.findElement(By.xpath("//*[@id=\"img1\"]"));
//		File src1=sc1.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src1, new File("Logo1.png"));
//			File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
////	FileUtils.copyFile(src, new File("C:\\Users\\ADMIN\\Desktop\\Screenshot\\Logo.png"));
//	FileHandler.copy(src,  new File("C:\\Users\\ADMIN\\Desktop\\Screenshot\\Logo.png"));
//	System.out.println("Height :"+sc1.getRect().getDimension().getHeight()+"Width :"+ sc1.getRect().getDimension().getWidth());
//	sc1.getRect().getDimension().getHeight();
//	sc1.getRect().getDimension().getWidth();
}
}