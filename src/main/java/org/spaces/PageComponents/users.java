package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class users  extends AbstractComponent {
    WebDriver driver;
    By users = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[3]/a[1]");

    public users(WebDriver driver, By users) {
        super(driver, users);
    }

    public boolean checkUsers()
    {
        findElement(users);
        return true;
    }
}
