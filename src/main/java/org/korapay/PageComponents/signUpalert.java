package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpalert extends AbstractComponent {
    WebDriver driver;
    By signUpalert = By.tagName("div");

    public signUpalert(WebDriver driver, By signUpalert) {
        super(driver, signUpalert);
    }

    public boolean checkSignUpdisplay()
    {
        findElement(signUpalert);
        return true;
    }
}
