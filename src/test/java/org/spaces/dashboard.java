package org.spaces;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class dashboard extends signIn {

    @Test

        public void dashboardTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();


        //confirm if the dashboard elements loads
        adminLandingPage landing = new adminLandingPage(driver);

        if(landing.getdashboard().checkDashboard()){

            System.out.println("Dashboard displays successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }
}
