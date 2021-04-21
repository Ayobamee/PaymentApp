package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class loginToDashboard extends AbstractComponent {
    WebDriver driver;
    By loginToDashboard = By.xpath("//button[contains(text(),'Login')]");

    public loginToDashboard(WebDriver driver, By loginToDashboard) {
        super(driver, loginToDashboard);
    }

    public void clickLogin ()
    {
        findElement(loginToDashboard).click();


    }
}
