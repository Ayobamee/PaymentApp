package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterUsername extends AbstractComponent {
    WebDriver driver;
    By enterUsername = By.xpath("//input[@name='username']");
    public enterUsername(WebDriver driver, By enterUsername) {
        super(driver, enterUsername);
    }

    public void typeUsername(String alpha)
    {
        findElement(enterUsername)
                .sendKeys("Autotest" + alpha);
    }

}
