package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageClass {
	@FindBy(xpath ="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password ;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement logInButton;
	
	public LogInPageClass(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}
	
	// Action on webElement
	
	public void sendUserName() {
		if(userName.isDisplayed()) {
			userName.sendKeys("admin");
		}
	}
	
	public void sendPassWord() {
		if(password.isDisplayed()) {
			password.sendKeys("manager");
		}
	}
	public void clickOnLoginButton() {
		if(logInButton.isDisplayed()) {
			logInButton.click();
		}
		
	}
	

}
