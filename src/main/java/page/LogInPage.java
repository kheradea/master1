package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(id="userid")
	private WebElement userID;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logInButton;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement continueButton;
	@FindBy(xpath="//label[text()='PIN']")
	private WebElement pinPageText;
	public LogInPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void userId()
	{
	userID.sendKeys("LGD943");
	}
	public void password()
	{
	passWord.sendKeys("shree@1234");
	}
	public void login()
	{
	logInButton.click();
	}
	public void pin()
	{
	pin.sendKeys("123456");
	}
	public void continueButton()
	{
	continueButton.click();
	}
	public boolean pinPageValidation()
	{
	String text = pinPageText.getText();
	return text.contains("PIN1233");
	}

}
