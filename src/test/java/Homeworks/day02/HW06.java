package Homeworks.day02;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW06 {
    static WebDriver driver;
    //TC - 09

// Go to w3school homepage
// Do the following tasks by creating 3 different test methods.
    //  *- Print "STARTED" before all test() methods run
//*- Print "FINISHED" after all test() methods run.
    //  *- Before all test() methods run, print "Test has started"
    //*- Print "method name + running" in all test methods
//*- After all test() methods run, print "Test finished"
// Test if the title contains "w3school" when the page window is minimize
// Test if the title does not contain "boss" when the page window is fullscreen


    @BeforeClass
    public static void before() {
        driver = new ChromeDriver();
        driver.get("https://w3school.com");
        driver.manage().window().fullscreen();


    }

    @Before
    public void beforeClass() {
        System.out.println("STARTED");
        System.out.println("Test has started");

    }


    @After
    public void After1() {
        System.out.println("Test finished");
        System.out.println("FINISHED");

    }
    @Test
    public void test010(){
// Test if the title contains "w3school" when the page window is minimize
// Test if the title does not contain "boss" when the page window is fullscreen

        driver.manage().window().minimize();
        String titel1 = driver.getTitle();
        Assert.assertTrue(titel1.contains("W3Schools"));
    }


// Test if the title does not contain "boss" when the page window is fullscreen
@Test
public void test012(){
// Test if the title does not contain "boss" when the page window is fullscreen

    driver.manage().window().fullscreen();
    String titel2 = driver.getTitle();
    Assert.assertFalse(titel2.contains("boss"));
}

}