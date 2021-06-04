package org.TestSuite;
import org.korapay.PageObjects.korapayLandingPage;
import org.testng.annotations.Test;
import reusable.signIn;

import java.io.IOException;


public class login extends signIn {

    //Test that user can be logged into the korapay web app successfully.
    @Test

        public void loginTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        korapayLandingPage korapay = new korapayLandingPage(driver);

        //Assert that login was successful.
        if(korapay.getloginAlert().checkLoginDisplay()){

            System.out.println("User was logged into the app successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();


    }
}
