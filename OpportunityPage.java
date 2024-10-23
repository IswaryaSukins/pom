package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjectSpecificMethod;

public class OpportunityPage extends ProjectSpecificMethod {
	
	public OpportunityPage(RemoteWebDriver driver){
		this.driver=driver;
	}
	
	public NewOpportunityPage clickOpportunities() {
	WebElement oppur = driver.findElement(By.xpath("//span[text()='Opportunities']"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", oppur);
    return new NewOpportunityPage(driver);
}
}

