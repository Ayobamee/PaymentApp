package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class dashboard extends AbstractComponent {
    WebDriver driver;
    By dashboard = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/a[1]");
    public dashboard(WebDriver driver, By dashboard) {
        super(driver, dashboard);
    }

    public boolean checkDashboard()
    {
        findElement(dashboard);
        return true;
    }
}
