package vtiger.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class vtigetTest extends TestBase{
	
	@Test
	public void vtigetloginPage()
	{
		LoginPage Logins = PageFactory.initElements(driver, LoginPage.class);
		Logins.vtigetpage("shail", "pass");
	}

}
