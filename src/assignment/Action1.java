package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\H:\\chromedriver.exe");
		WebDriver o = new ChromeDriver();
		o.get("https://jqueryui.com/draggable/");
		List<WebElement> list = o.findElements(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li"));
		for (int i = 0; i < 5; i++) {
			if (list.get(i).getText().equalsIgnoreCase("draggable")) {
				list.get(i).click();
				o.switchTo().frame(o.findElement(By.xpath("//*[@id='content']/iframe")));
				WebElement w1 = o.findElement(By.xpath("//*[@id='draggable']"));
				Actions a = new Actions(o);
				a.clickAndHold(w1).moveByOffset(200, 50).release().perform();

				o.switchTo().defaultContent();
			

			} else if (list.get(i).getText().equalsIgnoreCase("droppable")) {
				list.get(i).click();
				o.switchTo().frame(o.findElement(By.xpath("//*[@id='content']/iframe")));
				WebElement w2 = o.findElement(By.xpath("//*[@id='draggable']"));
				WebElement target = o.findElement(By.xpath("//*[@id='droppable']"));
				Actions a = new Actions(o);
				a.dragAndDrop(w2, target).perform();
				o.switchTo().defaultContent();
			}

			else if (list.get(i).getText().equalsIgnoreCase("Resizable")) {
				list.get(i).click();
				o.switchTo().frame(o.findElement(By.xpath("//*[@id='content']/iframe")));
				WebElement w3 = o.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
				Actions a = new Actions(o);
				a.clickAndHold(w3).moveByOffset(0, 100).release().build().perform();
				o.switchTo().defaultContent();
			}
		}
	}

}
