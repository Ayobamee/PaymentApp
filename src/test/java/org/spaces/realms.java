package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class realms extends signIn {

    @Test

        public void realmsTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the realms elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getrealms().checkRealms()){

            System.out.println("Realms module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
