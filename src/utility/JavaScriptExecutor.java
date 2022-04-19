package utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JavaScriptExecutor {
	
		public static void scroll (WebDriver d,int x,int y)
		{
			
			JavascriptExecutor exe= (JavascriptExecutor) d;
			exe.executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public static void scrollView (WebDriver d, WebElement location)
		{
			JavascriptExecutor exe= (JavascriptExecutor) d;
			exe.executeScript("arguments[0].scrollIntoView();",location);
			
		}
	
		
}
