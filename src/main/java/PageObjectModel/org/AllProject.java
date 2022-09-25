package PageObjectModel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProject {
	public static WebDriver driver;
	@FindBy(xpath="//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeMedium MuiChip-colorDefault MuiChip-filledDefault css-1dhsi03']")
	private WebElement partiproject;
	
	public AllProject(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPartiproject() {
		return partiproject;
	}
	
	
}
