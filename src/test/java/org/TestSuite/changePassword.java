package org.TestSuite;
import org.korapay.PageObjects.korapayLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reusable.clickProfile;
import reusable.signIn;

import java.io.IOException;


public class changePassword extends signIn {

    //Test that password can be changed.
    @Test

        public void changePasswordTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        korapayLandingPage korapay = new korapayLandingPage(driver);

        //Click Profile
        clickProfile selectprofile = new clickProfile();
        selectprofile.Profile(driver);

        //click security
        korapay.getsecurity().click();

        //set password
        korapay.getsetFirstPassword().inputPassword();

        //Confirm password
        korapay.getreconfirmPassword().inputPassword();

        //Click CTA to change password
        korapay.getconfirmPassword().click();

        if(korapay.getpasswordChangeAlert().checkPasswordChangeDisplay()){

            System.out.println("Password change flow tested successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }


        //close the app
        driver.quit();


    }
}
