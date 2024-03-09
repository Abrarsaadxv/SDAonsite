package Homeworks.Week1.day01.day02;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW05 {

    // TC - 07

// Go to YouTube homepage
// Do the following tasks by creating 4 different test methods.
//*- Print "Test is running" before each test() method
//     *- Print "Test finished" after each test() method
// Test if the currentURL contains "youtube" DONE
// Test if the title does not contain "Video".DONE
// Test if the URL contains "youtube".
// Test if the sourcePage contains "youtube".

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

    static WebDriver driver;
/*


    @BeforeClass
    public  static void  class1 (){
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com");

    }
    @Before
    public void beforem(){
        System.out.println("Test is running");

    }
    @After
    public void afrerm(){
        System.out.println("Test finished");
    }

@Test
    public void Test1(){
        String URL =driver.getCurrentUrl();
        if(URL.contains("youtube")){
            System.out.println("The currentURL containe  the word 'youtube'");
        }

}
    @Test
    public void Test2() {
        // Test if the title does not contain "Video".
        String Titel1 = driver.getTitle();
        Assert.assertFalse(Titel1.contains("*Video*"));
    }

// Test if the URL contains "youtube".

    @Test
    public void Test3() {

        String urlTest = driver.getCurrentUrl();
        Assert.assertTrue(urlTest.contains("youtube"));

    }
    // Test if the sourcePage contains "youtube".

    @Test
    public void Test4(){
        String sourcePage=driver.getPageSource();
        Assert.assertTrue(sourcePage.contains("youtube"));
    }
    */

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

// TC - 08

// Go to google homepage
// Do the following tasks by creating 3 different test methods.
//*- Print "Tests are starting to run" before each test() method
//*- Print "Tests have finished running" after each test() method
// Test if the title is the same when the page window is maximize and minimize
// Test if the title does not contain "Video" when the page window is fullscreen
// Test if the URL contains "google"
@BeforeClass
public static void setUpclass() {
    driver = new ChromeDriver();
    driver.get("https://google.com"); }



    @Before
    public void beforem(){
        System.out.println("Tests are starting to run"); }


    @After
    public void afrerm(){
        System.out.println("Tests have finished running");
    }


    @Test
    public void Test1() {
        driver.manage().window().maximize();
        String Max = driver.getTitle();
        driver.manage().window().minimize();
        String Min = driver.getTitle();
        Assert.assertEquals(Max,Min); }

    @Test
    public void Test2() {
// Test if the title does not contain "Video" when the page window is fullscreen
        driver.manage().window().fullscreen();
        String ContainTitel = driver.getTitle();
        Assert.assertFalse(ContainTitel.contains("Video")); }
    @Test
    public void Test3() {
//Test if the URL contains "google".
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("google")); }


}
