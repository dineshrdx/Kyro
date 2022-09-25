package PageObjectModel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTask {
	public static WebDriver driver;
	@FindBy(name="summary")
	private WebElement summary;
	
	@FindBy(name="task_type")
	private WebElement tasktype;
	
	@FindBy(name="description")
	private WebElement descrip;
	
	@FindBy(xpath="(//div[@role='button'])[2]")
	private WebElement priority ;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement type;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="start_date")
	private WebElement strtdate;
	
	@FindBy(name="due_date")
	private WebElement duedate;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit ;

	public NewTask(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getTasktype() {
		return tasktype;
	}

	public WebElement getDescrip() {
		return descrip;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getStrtdate() {
		return strtdate;
	}

	public WebElement getDuedate() {
		return duedate;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
}
