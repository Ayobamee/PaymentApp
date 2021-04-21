package org.spaces.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.PageComponents.*;

public class spacesDashboardPage {

    By username = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By password = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
    By loginToDashboard = By.xpath("//button[contains(text(),'Login')]");




    WebDriver driver;

    public spacesDashboardPage(WebDriver driver) {

        this.driver = driver;


    }

    public void goTo()
    {
        driver.get("https://admin-staging.spaceso2o.com/");
    }



    public username getusername()
    {

        return new username(driver, username);
    }


    public password getpassword()
    {

        return new password(driver, password);
    }



    public loginToDashboard getloginToDashboard()
    {

        return new loginToDashboard(driver, loginToDashboard);
    }





}
