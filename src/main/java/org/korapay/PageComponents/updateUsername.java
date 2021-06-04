package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updateUsername  extends AbstractComponent {
    WebDriver driver;
    By updateUsername =  By.xpath("//input[@name='username']");

    public updateUsername(WebDriver driver, By updateUsername) {
        super(driver, updateUsername);
    }
    public void enterNewUsername()
    {
        findElement(updateUsername)
                .sendKeys("a");
    }
}
