package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class setFirstPassword extends AbstractComponent {
    WebDriver driver;
    By setFirstPassword = By.xpath("//input[@name='password']");

    public setFirstPassword(WebDriver driver, By setFirstPassword) {
        super(driver, setFirstPassword);
    }
    public void inputPassword()
    {
        findElement(setFirstPassword)
                .sendKeys("Korapay2021!");
    }
}
