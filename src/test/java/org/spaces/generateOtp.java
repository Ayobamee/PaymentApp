package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class generateOtp extends signIn {

    @Test

        public void generateOtpTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the generate Otp elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getgenerateOtp().checkgenerateOtp()){

            System.out.println("Generate Otp module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
