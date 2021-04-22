package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class trivia extends AbstractComponent {
    WebDriver driver;
    By trivia = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[7]/a[1]");

    public trivia(WebDriver driver, By trivia) {
        super(driver, trivia);
    }

    public boolean checktrivia()
    {
        findElement(trivia);
        return true;
    }
}
