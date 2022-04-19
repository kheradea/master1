package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");

		WebDriver o = new ChromeDriver();
		o.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);

		List<WebElement> list = o.findElements(By.xpath("//table[@class='ws-table-all']//tr"));

		for (int i = 1; i <= list.size(); i++) {

			for (int j = 1; j <= 3; j++) {
				if (i == 1) {
					System.out.print("\t"
							+ o.findElement(By.xpath("//table[@class='ws-table-all']//tr[" + i + "]//th[" + j + "]"))
									.getText());
				} else {
					System.out.print("\t"
							+ o.findElement(By.xpath("//table[@class='ws-table-all']//tr[" + i + "]//td[" + j + "]"))
									.getText());
				}

			}
			System.out.println();
		}
	}
}
