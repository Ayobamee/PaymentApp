package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class security extends AbstractComponent {
    WebDriver driver;
    By security = By.xpath("//a[contains(text(),'Security')]");
    public security(WebDriver driver, By security) {
        super(driver, security);
    }

    public void click()
    {
        findElement(security).click();
    }
}



