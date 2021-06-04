package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reEnterPassword extends AbstractComponent {
    WebDriver driver;
    By reEnterPassword = By.xpath("//input[@name='confirmPassword']");
    public reEnterPassword(WebDriver driver, By reEnterPassword) {
        super(driver, reEnterPassword);
    }

    public void typePassword()
    {
        findElement(reEnterPassword)
                .sendKeys("test1234567!");
    }
}
