package Week5.Day01.Day03;

import Utility.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class C02TestNG {
    //Create tests that depend on each other
//Create beforeClass and set up settings.
//By creating interdependent tests;
//First go to Facebook.
//Then go to Google depending on Facebook,
//Then go to Amazon depending on Google
//Close the driver.
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {

        driver = new ChromeDriver();
    }

    @Test
    public void test3Facebook() {
        driver.get("https://www.facebook.com/");

        System.out.println("Facebook is executed");

    }

    @Test(dependsOnMethods = {"test3Facebook"})
    public void test1google() {
        driver.get("https://www.google.com");

        System.out.println("google is executed");
    }

    @Test(dependsOnMethods = {"test1google"})
    public void test2Amazon() {
        driver.get("https://www.Amazon.com");

        System.out.println("amazone is executed");
        driver.close();

    }


}
