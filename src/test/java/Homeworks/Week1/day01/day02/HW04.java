package Homeworks.Week1.day01.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class HW04 {
    public static void main(String[] args) throws InterruptedException {

        // TC - 01
// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.
// *_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

        // WebDriver driver =new ChromeDriver();
/*

        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://www.w3schools.com");
        driver.navigate().to("https://stackoverflow.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();  */
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

        // TC - 02
// Go to www.yahoo.com
// Maximize Window
// Go to www.amazon.com
// Maximize Window
// Navigate Back
// Navigate Forward
// Refresh The Page
        //*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

         /*



        WebDriver driver =new ChromeDriver();
        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();    */

        //*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
        //*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_


// TC – 03
// Expected Title
// Set Path of the Chrome driver
// Launch Chrome browser
// Open URL of Website
// Maximize Window
// Get Title of current Page
// Validate/Compare Page Title
// Close Browser

/*
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_


        WebDriver driver =new ChromeDriver();

// Set Path of the Chrome driver
        System.setProperty ("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

        // Expected Title
        String expectedTitle  = "Google website";
        driver.get(expectedTitle);
        driver.manage().window().maximize();
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

        // Get Title of current Page
        String currentpage= driver.getTitle();
        System.out.println(" The currentpage is  : " + currentpage);

        if(currentpage.contains(expectedTitle)){
            System.out.println("The title page is matched ");
        }
        else {
            System.out.println("The title page is  dose not matched ");

        }

        driver.close();  */

/*
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_


// TC - 04

// Go to the w3school URL : https://www.w3schools.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want. // Close the page.


        WebDriver driver =new ChromeDriver();
driver.get("https://www.w3schools.com");

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
// Print the position and size of the page.

        System.out.println(" the position page is : " + driver.manage().window().getPosition());
        System.out.println("the position page is :" + driver.manage().window().getSize());
driver.manage().window().setPosition(new Point(300,150));
driver.manage().window().setSize(new Dimension(1050,900));
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

// Test that the page is in the position and size you want. // Close the page.

        int X = driver.manage().window().getPosition().getX();
        int Y = driver.manage().window().getPosition().getY();

        int width= driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

        if (X==100 && Y==60 && width== 200 && height==150){
            System.out.println("True");

        }
else {
            System.out.println("False ");
        }

driver.close();;
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
 */

        // TC - 05

// Invoke Chrome Browser
// Open URL: https: https://www.w3schools.com/
// Maximize the window.
// Print the position and size of the page.
// Minimize the page.
// Wait 7 seconds in the icon state and maximize the page.
// Print the position and dimensions of the page in maximized state.
// Make the page fullscreen.
// Close the Browser
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
        /*

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.w3schools.com");
        driver.manage().window().maximize();
        System.out.println("The position is : " + driver.manage().window().getPosition());
        System.out.println("The size  is : " + driver.manage().window().getSize());
        driver.manage().window().minimize();
        sleep(7000);


        System.out.println("The Size is :"+driver.manage().window().getSize());
        System.out.println(" The Position is : "+driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
driver.close();
 */
        //*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_


        // TC - 06
// Invoke FireFox Driver
// Go to https://www.youtube.com/
// Maximize the window
// Verify the page title contains the word video.
// Minimize the window
// Verify the page title contains the word video.
// Make the page fullscreen
// Close the driver.
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
/*



        WebDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com");
driver.manage().window().maximize();
String title=driver.getTitle();
if(title.contains("video")) {
    System.out.println(" The page titel contain the worde *'VIDEO'* ");
}
else {
    System.out.println(" The page titel  dose not contain the worde *'VIDEO'* ");

}
    driver.manage().window().fullscreen();
    driver.quit();
  */

//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_

//_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_
//*_*__*_*_*_*_*_*__*_*__*_**___*_*_*_*__*_*_*_*_*_*__*_*__*_**_




    }
}
