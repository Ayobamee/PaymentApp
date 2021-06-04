package reusable;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class clickProfile {


    public void Profile (WebDriver driver)
    {
        WebElement ele = driver.findElement(By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[3]/a[1]/img[1]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele);
        return ;
    }


}
