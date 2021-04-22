package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class adminRealms extends signIn {

    @Test

        public void adminRealmsTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the  adminRealms elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getadminRealms().checkadminRealms()){

            System.out.println("Admin Realms module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
