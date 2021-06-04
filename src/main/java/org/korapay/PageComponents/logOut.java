package org.korapay.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.AbstractComponents.AbstractComponent;

public class logOut extends AbstractComponent {
    WebDriver driver;
    By logOut = By.xpath("//a[contains(text(),'Log Out')]");

    public logOut(WebDriver driver, By logOut) {
        super(driver, logOut);
    }

    public void click()
    {
        findElement(logOut).click();
}
}
