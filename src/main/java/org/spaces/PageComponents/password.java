package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class password  extends AbstractComponent {
    WebDriver driver;
    By password = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
    public password(WebDriver driver, By password) {
        super(driver, password);
    }

    public void enterPassword ()
    {
        findElement(password).sendKeys("121212");


    }
}
