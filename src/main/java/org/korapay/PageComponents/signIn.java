package org.korapay.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.AbstractComponents.AbstractComponent;

public class signIn extends AbstractComponent {
    WebDriver driver;
    By signIn = By.xpath("//button[contains(text(),'Sign In')]");

    public signIn(WebDriver driver, By signIn) {
        super(driver, signIn);
    }

    public void click ()
    {
        findElement(signIn).click();


    }
}
