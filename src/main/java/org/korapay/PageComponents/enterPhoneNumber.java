package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterPhoneNumber extends AbstractComponent {
    WebDriver driver;
    By enterPhoneNumber = By.xpath("//input[@name='phone_number']");

    public enterPhoneNumber(WebDriver driver, By enterPhoneNumber) {
        super(driver, enterPhoneNumber);
    }

    public void typePhoneNumber(String fourDigits)
    {
        findElement(enterPhoneNumber)
                .sendKeys("0809000" + fourDigits);
    }
}
