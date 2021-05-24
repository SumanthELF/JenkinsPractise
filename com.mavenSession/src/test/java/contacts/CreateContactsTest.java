package contacts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactsTest {

	@Test(groups="smokeTest")
	public void createContact() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String msg = System.getProperty("msg");
	
		Reporter.log(url,true);
		Reporter.log(browser,true);
		Reporter.log(msg,true);
		Reporter.log("executing createContact",true);
	}
}
