package utility;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void screenshotAs(WebDriver driver,WebElement source,File target) throws IOException, InterruptedException
	{
			File src1= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	Thread.sleep(2000);
	FileHandler.copy(src1,target);
	}

}
