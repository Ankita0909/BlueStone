package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Open_CloseAppln;
import POM.GoldMine_Page;
import POM.HomePage;
import POM.PersonalDetails_Page;

public class Script31 extends Open_CloseAppln{

	@Test
	public void test10() throws InterruptedException, IOException 
	{
		HomePage hp=new HomePage(driver);
		hp.gold_Mine();
		Thread.sleep(3000);
		GoldMine_Page gp=new GoldMine_Page(driver);
		gp.notenterinfo(driver);
		PersonalDetails_Page pp=new PersonalDetails_Page(driver);
		pp.click_Next();
		
	}
}
