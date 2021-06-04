package org.TestSuite;


import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.korapay.PageObjects.korapayDashboardPage;
import org.testng.annotations.Test;
import reusable.Scroll;


public class signUp {
    public WebDriver driver;
    public Properties prop;
    String baseUrl = "https://alphapay.netlify.app/";
    String alpha = randomAlphabet(6);
    String fourDigits = randomfourdigits();


    //This test is to ensure users can sign up to the korapay application.
    @Test
    public void signupTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver90");
        driver = new ChromeDriver();

        korapayDashboardPage signUp = new korapayDashboardPage(driver);

        //open base url
        driver.get(baseUrl);

        //click signup
        signUp.getstartSignUp().click();

        //Wait for two seconds
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Enter fullname
        signUp.getenterFullname().typeFullName(alpha);

        //Enter username.
        signUp.getenterUsername().typeUsername(alpha);

        //Enter phone number
        signUp.getenterPhoneNumber().typePhoneNumber(fourDigits);

        //Enter email address
        signUp.getenterEmail().typeEmail(fourDigits);

        //Enter password
        signUp.getenterPassword().typePassword();

        //Confirm password
        signUp.getreEnterPassword().typePassword();

        //scroll
      Scroll scroll = new Scroll();
        scroll.longScroll(driver);

        //click create account
      signUp.getcreateAccount().click();


        //Assert that sign up was successful.
        if(signUp.getsignUpalert().checkSignUpdisplay()){

            System.out.println("User was signed up into the app successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //close the app
        driver.quit();

    }


    //Random alphabet method
    public String randomAlphabet(int length) {
        Random random = new Random();
        final int alphabetLength = 'Z' - 'A' + 1;
        StringBuilder result = new StringBuilder(length);
        while (result.length() < length) {
            final char charCaseBit = (char) (random.nextInt(2) << 5);
            result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
        }
        return result.toString();
    }


    //Random four digit method
    public static String randomfourdigits()
    {
        int randomdig   =(int) (Math.random()*9000)+1000;
        String digit  = String.valueOf(randomdig);
        return digit;
    }

}
