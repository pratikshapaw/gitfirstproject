package testclasses;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyCredential()
	{
		login.enterCredential();
	}
	
	@Test
	public void verifyLoginButtonfun()
	{
		login.verifyLoginbutton();
	}

}
