package Testcases;

import org.testng.annotations.Test;

import BaseClass.ProjectSpecificMethod;
import Pages.LoginPage;

public class TCLogin001 extends ProjectSpecificMethod {
	
	@Test
	public void runner(String name,String amnt) {
		new LoginPage(driver)
		.enterPassword()
		.enterPassword()
		.clickLogin()
		.clickToggle()
		.clickViewALL()
		.clickSales()
		.clickOpportunities()
		.clickNew()
		.enterName(name)
		.enterAmount(amnt)
		.clickStage()
		.closeDate()
		.saveEdit()
		.verifyText();
	}


}
