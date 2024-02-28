package Homeworks.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class HW001 {


    WebDriver driver ;
String expectedurl="https://automationexercise.com/";
    @Test
    public  void test(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
Assert.assertNotNull(driver);
      driver.get("https://automationexercise.com/");
String currenturl = driver.getCurrentUrl();
Assert.assertEquals(expectedurl,currenturl);
driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
        System.out.println("Login to your account’ is visible ");
        Assert.assertTrue(currenturl.contains("automation"));
        WebElement myemail = driver.findElement(By.name("email") );
      myemail.sendKeys(" sda@test.com"+ Keys.SPACE);

        WebElement mypass= driver.findElement(By.name("password"));
        mypass.sendKeys("sdainclasstask"+ Keys.ENTER);
        String titel1 = driver.getTitle();
        System.out.println("titel1 = " + titel1);
       Assert.assertTrue(titel1.contains("Automation Exercise - Signup / Login"));


// driver.findElement(By.linkText(" Signup / Login")).click();
// driver.findElement(By.partialLinkText(" login")).click();
    //driver.findElement(By.xpath("//*[.='Login']")).click();
//    String expurl = driver.getCurrentUrl();
//        System.out.println("the act url is   = " + expurl);
       // String titel1 = driver.getTitle();

      //  Assert.assertTrue(titel1.contains("AutomationExercise"));


    }

}
