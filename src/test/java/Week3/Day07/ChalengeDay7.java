package Day07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChalengeDay7 {
    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }

    @Test
    public void test() throws InterruptedException{

//Task 3:
//navigate to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
//click on "Click me, to Open an alert after 5 seconds" button
       WebElement elm1 = driver.findElement(By.id("alert"));
       elm1.click();

        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofMillis(10000));
        wait.until(ExpectedConditions.alertIsPresent());

//click on accept alert

        driver.switchTo().alert().accept();

//click on "Change Text to Selenium Webdriver"

        driver.findElement(By.id("populate-text")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        WebElement assert1 = driver.findElement(By.xpath("//*[text()='Selenium Webdriver']"));
        Assert.assertTrue(assert1.isDisplayed());
//verify "Selenium Webdriver" message is displayed
        //6. click on "Display button after 10 seconds" button
        
        //7. verify the button is displayed
        //8. click on "Enable button after 10 seconds" button
        //9. verify the button is enabled
        //10. click on "Check Checkbox after 10 seconds" button
        //11. verify the check box is checked



    }

}
