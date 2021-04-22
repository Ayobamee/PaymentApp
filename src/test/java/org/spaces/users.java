package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class users extends signIn {

    @Test

        public void usersTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the users elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getusers().checkUsers()){

            System.out.println("User module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
