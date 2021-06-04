package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAccount extends AbstractComponent {
    WebDriver driver;
    By createAccount = By.xpath("//div[@id='root']/section/div/form/div/div[8]/button");

    public createAccount(WebDriver driver, By createAccount) {
        super(driver, createAccount);
    }

    public void click()
    {
        findElement(createAccount)
                .click();
    }
}
