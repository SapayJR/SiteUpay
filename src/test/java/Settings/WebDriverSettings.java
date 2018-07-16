package Settings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public ChromeDriver driver;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://upay.uz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    @After
    public void tearDown() throws Exception {
        if (driver !=null)
            driver.quit();
    }
}
