package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startSignUp  extends AbstractComponent {
    WebDriver driver;
    By startSignUp = By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[1]");

    public startSignUp(WebDriver driver, By startSignUp) {
        super(driver, startSignUp);
    }

    public void click()
    {
        findElement(startSignUp)
                .click();
    }
}
