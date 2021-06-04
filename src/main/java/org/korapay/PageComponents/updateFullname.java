package org.korapay.PageComponents;

import org.korapay.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updateFullname  extends AbstractComponent {
    WebDriver driver;
    By updateFullname = By.xpath("//input[@name='full_name']");
    public updateFullname(WebDriver driver, By updateFullname) {
        super(driver, updateFullname);
    }

    public void enterFullname()
    {
        findElement(updateFullname)
                .sendKeys("a");
    }

}
