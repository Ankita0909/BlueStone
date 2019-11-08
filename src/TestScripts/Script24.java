package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Open_CloseAppln;
import POM.HomePage;
import POM.Rings_Page;

public class Script24 extends Open_CloseAppln{

	@Test
	public void test10() throws InterruptedException, IOException 
	{
		HomePage hp=new HomePage(driver);
		hp.Search_Ring();
		Thread.sleep(3000);
		Rings_Page rp=new Rings_Page(driver);
		rp.PureGold(driver);
	}
}
