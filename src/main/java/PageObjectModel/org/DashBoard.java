package PageObjectModel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	public static WebDriver driver;
	@FindBy(xpath="(//div[@class='MuiListItemText-root css-1tsvksn'])[3]")
	private WebElement navtodb;
	
	
	
	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement getNavtodb() {
		return navtodb;
	}

}
