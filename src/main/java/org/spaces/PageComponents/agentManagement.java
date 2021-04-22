package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class agentManagement extends AbstractComponent {
    WebDriver driver;
    By agentManagement = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[2]/a[1]");
    public agentManagement(WebDriver driver, By agentManagement) {
        super(driver, agentManagement);
    }

    public boolean checkAgentManagment()
    {
        findElement(agentManagement);
        return true;
    }
}
