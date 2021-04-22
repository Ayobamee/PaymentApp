package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class realms extends AbstractComponent {
    WebDriver driver;
    By realms = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[4]/a[1]");

    public realms(WebDriver driver, By realms) {
        super(driver, realms);
    }

    public boolean checkRealms()
    {
        findElement(realms);
        return true;
    }
}
