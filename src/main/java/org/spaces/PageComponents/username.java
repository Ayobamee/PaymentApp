package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class username extends AbstractComponent {
    WebDriver driver;
    By username = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    public username(WebDriver driver, By username) {
        super(driver, username);
    }

    public void enterUsername ()
    {
        findElement(username).sendKeys("qaa@yopmail.com");


    }
}
