package reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.korapay.PageObjects.korapayDashboardPage;



public class signIn {
    public WebDriver driver;
    public Properties prop;


    public WebDriver  signIn () throws IOException, InterruptedException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver90");
            driver = new ChromeDriver();


        }

        else if(prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();

        }

        else {

            driver = new InternetExplorerDriver();

        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Open korapay home page.
        driver.get(prop.getProperty("URL"));

        //Create an object from the spaces landing page.
        korapayDashboardPage kora = new korapayDashboardPage(driver);

        //Click login
        kora.getloginToDashboard().clickLogin();

        //Input username
        kora.getusername().enterUsername();

        //Input password
        kora.getpassword().enterPassword();

        //Click sign
         kora.getsignIn().click();


        return driver;
    }

}
