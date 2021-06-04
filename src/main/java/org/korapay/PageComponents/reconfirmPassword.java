package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reconfirmPassword extends AbstractComponent {
    WebDriver driver;
    By reconfirmPassword = By.xpath("//input[@name='new_password']");

    public reconfirmPassword(WebDriver driver, By reconfirmPassword) {
        super(driver, reconfirmPassword);
    }
    public void inputPassword()
    {
        findElement(reconfirmPassword)
                .sendKeys("Korapay2021!");
    }
}
