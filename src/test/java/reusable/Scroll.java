package reusable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {

    public void longScroll(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
        return;

    }


}
