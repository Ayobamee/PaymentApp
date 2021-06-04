package org.korapay.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.AbstractComponents.AbstractComponent;

public class password  extends AbstractComponent {
    WebDriver driver;
    By password = By.xpath("//body/div[@id='root']/section[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
    public password(WebDriver driver, By password) {
        super(driver, password);
    }

    public void enterPassword ()
    {
        findElement(password).sendKeys("Korapay2021!");


    }
}
