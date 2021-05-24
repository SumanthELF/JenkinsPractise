package leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateLeadsTest {

	@Test(groups="smokeTest")
	public void createLead() {
		Reporter.log("executing createLead",true);
	}
}
