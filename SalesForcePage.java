package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjectSpecificMethod;

public class SalesForcePage extends ProjectSpecificMethod {
	

	public SalesForcePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public OpportunityPage clickSales() {
    driver.findElement(By.xpath("//p[text()='Sales']")).click();
    return new OpportunityPage(driver);


}
}
