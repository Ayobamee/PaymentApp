package org.korapay.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.korapay.PageComponents.*;
import org.korapay.PageComponents.settingsProfile;

public class korapayLandingPage {

    By loginAlert = By.xpath("//div[contains(text(),'Login Successful')]");
    By logOut = By.xpath("//a[contains(text(),'Log Out')]");
    By logOutAlert = By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/img[1]");
    By settingsProfile = By.xpath("/a[contains(text(),'Profile')]");
    By security = By.xpath("//a[contains(text(),'Security')]");
    By setFirstPassword = By.xpath("//input[@name='password']");
    By reconfirmPassword = By.xpath("//input[@name='new_password']");
    By confirmPassword = By.xpath("//button[contains(text(),'Change Password')]");
    By passwordChangeAlert = By.tagName("div");
    By updateFullname = By.xpath("//input[@name='full_name']");
    By updateUsername =  By.xpath("//input[@name='username']");
    By updateProfileButton = By.xpath("//button[@type='submit']");
    By updatedProfileAlert = By.tagName("div");




    WebDriver driver;
    public korapayLandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public loginAlert getloginAlert()
    {
        return new loginAlert(driver, loginAlert);
    }


    public logOut getlogOut()
    {
        return new logOut(driver, logOut);
    }

    public logOutAlert getlogOutAlertt()
    {
        return new logOutAlert(driver, logOutAlert);
    }

    public settingsProfile getsettingsProfile()
    {
        return new settingsProfile(driver, settingsProfile);
    }

    public security getsecurity()
    {
        return new security(driver, security);
    }

    public setFirstPassword getsetFirstPassword()
    {
        return new setFirstPassword(driver, setFirstPassword);
    }

    public reconfirmPassword getreconfirmPassword()
    {
        return new reconfirmPassword(driver, reconfirmPassword);
    }

    public confirmPassword getconfirmPassword()
    {
        return new confirmPassword(driver, confirmPassword);
    }

    public passwordChangeAlert getpasswordChangeAlert()
    {
        return new passwordChangeAlert(driver, passwordChangeAlert);
    }


    public updateFullname getupdateFullname()
    {
        return new updateFullname(driver, updateFullname);
    }

    public updateUsername getupdateUsername()
    {
        return new updateUsername(driver, updateUsername);
    }

    public updateProfileButton getupdateProfileButton()
    {
        return new updateProfileButton(driver, updateProfileButton);
    }

    public updatedProfileAlert getupdatedProfileAlert()
    {
        return new updatedProfileAlert(driver, updatedProfileAlert);
    }





}
