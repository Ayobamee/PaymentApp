package org.TestSuite;
import org.korapay.PageObjects.korapayLandingPage;
import org.testng.annotations.Test;
import reusable.Scroll;
import reusable.clickProfile;
import reusable.signIn;
import java.io.IOException;


public class updateProfile extends signIn {

    //Test that user can update their profile successfully.
    @Test

        public void updateProfileTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        korapayLandingPage korapay = new korapayLandingPage(driver);

        //Click Profile
        clickProfile selectprofile = new clickProfile();
        selectprofile.Profile(driver);

        //Enter new Fullname
        korapay.getupdateFullname().enterFullname();

        //Scroll
        Scroll sc = new Scroll();
        sc.longScroll(driver);

        //Enter new Username
        korapay.getupdateUsername().enterNewUsername();

        //Click Update details
        korapay.getupdateProfileButton().click();


        //Assert that profile is updated .
        if(korapay.getupdatedProfileAlert().checkUpdateProfileDisplay()){

            System.out.println("Profile is updated successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();


    }
}
