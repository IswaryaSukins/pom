package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjectSpecificMethod;

public class VerifyPage extends ProjectSpecificMethod {
	
	public VerifyPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
public VerifyPage verifyText() {
	String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Iswarya']")).getText();
    System.out.println(text);
    
    if(text.contains("Iswarya")) {
    	System.out.println("Verified");
    }else {
    	System.out.println("Not Verified");
    	
    	
    		
    	}
    return this;
    }
}
