package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHeader {
	@FindBy(xpath ="//a[@class='content users']")
	private WebElement user;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement report ;
	
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement task;
	 
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	
	public ActitimeHeader(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnUserTab() {
		user.click();
	}
	public void clickOnReportTab() {
		report.click();
	}
	public void clickOnTask() {
		task.click();
	}
	public void clicOnLogout() {
		logout.click();
	}
}

