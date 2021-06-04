package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updateProfileButton extends AbstractComponent {
    WebDriver driver;
    By updateProfileButton = By.xpath("//button[@type='submit']");

    public updateProfileButton(WebDriver driver, By updateProfileButton) {
        super(driver, updateProfileButton);
    }

    public void click()
    {
        findElement(updateProfileButton)
                .click();
    }
}
