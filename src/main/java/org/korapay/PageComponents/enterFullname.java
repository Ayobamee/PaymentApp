package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterFullname extends AbstractComponent {
    WebDriver driver;
    By enterFullname = By.xpath("//input[@name='full_name']");

    public enterFullname(WebDriver driver, By enterFullname) {
        super(driver, enterFullname);
    }

    public void typeFullName(String alpha)
    {
        findElement(enterFullname)
                .sendKeys("Autotest" + alpha);
    }
}
