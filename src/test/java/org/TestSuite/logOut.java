package org.TestSuite;
import org.korapay.PageObjects.korapayLandingPage;
import org.testng.annotations.Test;
import reusable.clickProfile;
import reusable.signIn;

import java.io.IOException;


public class logOut extends signIn {

    //Test that user can be logged out of the korapay web app successfully.
    @Test

        public void logoutTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        korapayLandingPage kora = new korapayLandingPage(driver);

        //Click Profile
        clickProfile selectprofile = new clickProfile();
        selectprofile.Profile(driver);

        //Click log out
        kora.getlogOut().click();

        //Assert that logout was successful.
        if(kora.getlogOutAlertt().checkLogOutDisplay()){

            System.out.println("User was logged out of the app successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }


       //close the app
        driver.quit();

    }
}
