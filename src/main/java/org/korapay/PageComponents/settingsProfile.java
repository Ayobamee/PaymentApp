package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class settingsProfile extends AbstractComponent {




    WebDriver driver;
    By settingsProfile = By.xpath("/a[contains(text(),'Profile')]");
    public settingsProfile(WebDriver driver, By settingsProfile) {
        super(driver, settingsProfile);
    }

    public void enterPassword(String alpha)
    {

        findElement(settingsProfile).sendKeys("" );


    }
}
