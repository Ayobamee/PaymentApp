package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmPassword extends AbstractComponent {
    WebDriver driver;
    By confirmPassword = By.xpath("//button[contains(text(),'Change Password')]");

    public confirmPassword(WebDriver driver, By confirmPassword) {
        super(driver, confirmPassword);
    }

    public void click()
    {
        findElement(confirmPassword)
                .click();
    }
}
