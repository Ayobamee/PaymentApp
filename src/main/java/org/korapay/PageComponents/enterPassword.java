package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterPassword extends AbstractComponent {
    WebDriver driver;
    By enterPassword = By.xpath("//input[@name='password']");

    public enterPassword(WebDriver driver, By enterPassword) {
        super(driver, enterPassword);
    }

    public void typePassword()
    {
        findElement(enterPassword)
                .sendKeys("test1234567!");
    }
}
