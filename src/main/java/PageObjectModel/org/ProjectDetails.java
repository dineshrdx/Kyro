package PageObjectModel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetails {
	public static WebDriver driver;
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement project;
	public ProjectDetails(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProject() {
		return project;
	}
}
