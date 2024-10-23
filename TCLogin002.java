package Testcases;

import org.testng.annotations.Test;

import BaseClass.ProjectSpecificMethod;
import Pages.LoginPage;

public class TCLogin002 extends ProjectSpecificMethod {
	@Test
	public void runner() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPassword().clickLogin().clickToggle().
		clickViewALL().clickSales().clickOpportunities().clickNew().enterName(null).enterAmount(null).clickStage().saveEdit();
}
}
