package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class generateOtp extends AbstractComponent {
    WebDriver driver;
    By generateOtp = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[6]/a[1]");

    public generateOtp(WebDriver driver, By generateOtp) {
        super(driver, generateOtp);
    }

    public boolean checkgenerateOtp()
    {
        findElement(generateOtp);
        return true;
    }
}
