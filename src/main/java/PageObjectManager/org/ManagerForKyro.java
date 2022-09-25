package PageObjectManager.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.org.AllProject;
import PageObjectModel.org.DashBoard;
import PageObjectModel.org.HomePage;
import PageObjectModel.org.LoginDetails;
import PageObjectModel.org.NewTask;
import PageObjectModel.org.ProjectDetails;




public class ManagerForKyro {
	public static WebDriver driver;
private	HomePage hp;
	
	private	LoginDetails ld;
	
	private	DashBoard db;
	
	private	AllProject ap;
	
	private ProjectDetails pd;
	
	private	NewTask nt;

	public ManagerForKyro(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public HomePage getHp() {
		 hp = new HomePage(driver);
		return hp;
	}

	public LoginDetails getLd() {
		 ld = new LoginDetails (driver);
		return ld;
	}

	public DashBoard getDb() {
		 db = new DashBoard (driver);
		return db;
	}

	public AllProject getAp() {
		 ap =new AllProject(driver);
		return ap;
	}

	public ProjectDetails getPd() {
		 pd = new ProjectDetails(driver);
		return pd;
	}

	public NewTask getNt() {
		 nt = new NewTask(driver);
		return nt;
	}

	
}
