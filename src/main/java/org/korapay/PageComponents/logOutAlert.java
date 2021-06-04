package org.korapay.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.AbstractComponents.AbstractComponent;

public class logOutAlert extends AbstractComponent {
    WebDriver driver;
    By logOutAlert = By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/img[1]");
    public logOutAlert(WebDriver driver, By logOutAlert) {
        super(driver, logOutAlert);
    }

    public boolean checkLogOutDisplay()
    {
        findElement(logOutAlert);
        return true;
    }

}
