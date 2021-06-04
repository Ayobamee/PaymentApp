package org.korapay.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.AbstractComponents.AbstractComponent;

public class loginAlert extends AbstractComponent {
    WebDriver driver;
    By loginAlert = By.xpath("//div[contains(text(),'Login Successful')]");
    public loginAlert(WebDriver driver, By loginAlert) {
        super(driver, loginAlert);
    }

    public boolean checkLoginDisplay()
    {
        findElement(loginAlert);
        return true;
    }
}
