package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUserName() {
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	return this;
	}
	public LoginPage enterPassword() {
    driver.findElement(By.id("password")).sendKeys("leaf@2024");
    return this;
	}
    
    public HomePage clickLogin() {
    driver.findElement(By.id("Login")).click();
    return new HomePage(driver);
    }
}
