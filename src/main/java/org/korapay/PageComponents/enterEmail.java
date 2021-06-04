package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterEmail  extends AbstractComponent {
    WebDriver driver;
    By enterEmail = By.xpath("//input[@name='email']");

    public enterEmail(WebDriver driver, By enterEmail) {
        super(driver, enterEmail);
    }

    public void typeEmail(String fourDigits)
    {
        findElement(enterEmail)
                .sendKeys("Autotest" + fourDigits + "@kora.com");
    }
}
