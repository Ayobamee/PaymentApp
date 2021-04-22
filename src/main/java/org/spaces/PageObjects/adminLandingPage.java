package org.spaces.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.PageComponents.*;

public class adminLandingPage {

    By continueElement = By.xpath("//button[contains(text(),'Continue with phone number')]");
    By dashboard = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By agentManagement = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[2]/a[1]");
    By users = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[3]/a[1]");
    By realms = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[4]/a[1]");
    By adminRealms = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]");
    By generateOtp = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[6]/a[1]");
    By trivia = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[7]/a[1]");




    WebDriver driver;
    public adminLandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public void goTo()
    {
        driver.get("https://admin-staging.spaceso2o.com/");
    }


    public StartUpBar getStartUpBar()
    {

        return new StartUpBar(driver, continueElement);
    }


    public dashboard getdashboard()

    {
        return new dashboard(driver, dashboard);
    }



    public agentManagement getagentManagement()

    {
        return new agentManagement(driver, agentManagement);
    }


    public users getusers()

    {
        return new users(driver, users);
    }


    public realms getrealms()

    {
        return new realms(driver, realms);
    }

    public adminRealms getadminRealms()

    {
        return new adminRealms(driver, adminRealms);
    }


    public generateOtp getgenerateOtp()

    {
        return new generateOtp(driver, generateOtp);
    }

    public trivia gettrivia()

    {
        return new trivia(driver, trivia);
    }





}
