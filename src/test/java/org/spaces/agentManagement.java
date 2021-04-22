package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class agentManagement extends signIn {

    @Test

        public void agentManagementTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the dashboard elements loads
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getagentManagement().checkAgentManagment()){

            System.out.println("Agent management module displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
