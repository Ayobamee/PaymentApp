package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class adminRealms extends AbstractComponent {
    WebDriver driver;
    By adminRealms = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]");

    public adminRealms(WebDriver driver, By adminRealms) {
        super(driver, adminRealms);
    }
    public boolean checkadminRealms()
    {
        findElement(adminRealms);
        return true;
    }
}
