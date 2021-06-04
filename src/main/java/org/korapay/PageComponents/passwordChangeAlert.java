package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class passwordChangeAlert extends AbstractComponent {
    WebDriver driver;
    By passwordChangeAlert = By.tagName("div");

    public passwordChangeAlert(WebDriver driver, By passwordChangeAlert) {
        super(driver, passwordChangeAlert);
    }

    public boolean checkPasswordChangeDisplay()
    {
        findElement(passwordChangeAlert);
        return true;
    }
}
