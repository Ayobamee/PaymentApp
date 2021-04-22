package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class trivia extends signIn {

    @Test

        public void triviaTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the trivia elements loads.
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.gettrivia().checktrivia()){

            System.out.println("Trivia module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
