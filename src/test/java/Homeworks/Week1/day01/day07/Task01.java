package Homeworks.day07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_Task2_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*

public class Task01 {


    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void tst() {
        // testing pagelodingtimeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
        // it waite for the page loding for 8 sec  if its  not loaded by then it will send  atimeout error
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(" First Alert Text is : " + alert.getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        alert.accept();
        WebElement elemnt1 = driver.findElement(By.xpath("//button[ text()='Click for JS Confirm']"));
        elemnt1.click();
        WebDriverWait waite = new WebDriverWait(driver, Duration.ofSeconds(10));
        waite.until(ExpectedConditions.alertIsPresent());
        System.out.println(" Second Alert Text is : " + alert.getText());
        alert.accept();

//        //verify
        WebElement assert2 = driver.findElement(By.id("result"));
        System.out.println("The Result is  : " + assert2.getText());
        Assert.assertTrue(assert2.isDisplayed());
        //  3d feild
        Thread.sleep(2000);
        WebElement elemnt2 = driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));
        elemnt2.click();
        driver.switchTo().alert().sendKeys(Keys.chord(
                Keys.CONTROL, "Task1 one is almost done") + Keys.ENTER);
        alert.accept();
        Thread.sleep(2000);
//         Assert.assertTrue(driver.findElement(By.id("result")).getText().equals("Task1 one is almost done"));
        //Thread.sleep(2000);


    }
}
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*End_of_task1 _*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*