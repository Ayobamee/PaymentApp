package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updatedProfileAlert extends AbstractComponent {
    WebDriver driver;
    By updatedProfileAlert = By.tagName("div");
    public updatedProfileAlert(WebDriver driver, By updatedProfileAlert) {
        super(driver, updatedProfileAlert);
    }

    public boolean checkUpdateProfileDisplay()
    {
        findElement(updatedProfileAlert);
        return true;
    }
}
