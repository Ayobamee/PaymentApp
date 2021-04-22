package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class adminUsers extends signIn {

    @Test

        public void adminUsersTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the  admin users elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getadminRealms().checkadminRealms()){

            System.out.println("Admin users module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
