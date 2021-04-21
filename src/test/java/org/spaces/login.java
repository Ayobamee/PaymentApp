package org.spaces;
import org.openqa.selenium.JavascriptExecutor;
import org.spaces.PageObjects.adminLandingPage;
import org.testng.annotations.Test;
import org.spaces.PageObjects.myShopPage;
import spaces.signIn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class login extends signIn {

    @Test

        public void loginTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        //close the app
        driver.quit();


    }
}
