package org.korapay.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.PageComponents.*;

public class korapayDashboardPage {

    By username = By.xpath("//body/div[@id='root']/section[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By password = By.xpath("//body/div[@id='root']/section[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
    By loginToDashboard = By.xpath("//button[contains(text(),'LOG IN')]");
    By signIn = By.xpath("//button[contains(text(),'Sign In')]");
    By startSignUp = By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[1]");
    By enterFullname = By.xpath("//input[@name='full_name']");
    By enterUsername = By.xpath("//input[@name='username']");
    By enterPhoneNumber = By.xpath("//input[@name='phone_number']");
    By enterEmail = By.xpath("//input[@name='email']");
    By enterPassword = By.xpath("//input[@name='password']");
    By reEnterPassword = By.xpath("//input[@name='confirmPassword']");
    By createAccount = By.xpath("//div[@id='root']/section/div/form/div/div[8]/button");
    By signUpalert = By.tagName("div");





    WebDriver driver;

    public korapayDashboardPage(WebDriver driver) {

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

    public signIn getsignIn()
    {

        return new signIn(driver, signIn);
    }



    public startSignUp getstartSignUp()
    {

        return new startSignUp(driver, startSignUp);
    }



    public enterFullname getenterFullname()
    {

        return new enterFullname(driver, enterFullname);
    }



    public enterUsername getenterUsername()
    {

        return new enterUsername(driver, enterUsername);
    }

    public enterPhoneNumber getenterPhoneNumber()
    {

        return new enterPhoneNumber(driver, enterPhoneNumber);
    }



    public enterEmail getenterEmail()
    {

        return new enterEmail(driver, enterEmail);
    }



    public enterPassword getenterPassword()
    {

        return new enterPassword(driver, enterPassword);
    }




    public reEnterPassword getreEnterPassword()
    {

        return new reEnterPassword(driver, reEnterPassword);
    }


    public createAccount getcreateAccount()
    {

        return new createAccount(driver, createAccount);
    }




    public signUpalert getsignUpalert()
    {

        return new signUpalert(driver, signUpalert);
    }


}
