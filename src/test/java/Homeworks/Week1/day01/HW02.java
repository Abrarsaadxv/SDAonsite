package Homeworks.Week1.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) {
    /*
Verify  pagesource of FaceBook contains "Facebook" .
     */
        // ****** Invoke Chrome Driver  **************
        WebDriver driver= new ChromeDriver();
        // *****Navigate to Facebook homepage URL: https://www.facebook.com/ ********
        driver.get("https://google.com");

        driver.navigate().to("https://www.facebook.com");



     //***** Verify expected URL equals to the actual URL. ***

        String expectedUrl = "https://www.facebook.com";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
 // ***** Verify pagesource of FaceBook contains "Facebook" **
         String pagesou= driver.getPageSource();
        if(pagesou.contains("Facebook")){
            System.out.println(" The page source of Facebook contains the word  **Facebook** ");
        }
        else {
            System.out.println(" The page source of Facebook  dosnot contains the word  **Facebook** ");
        }
    }
}
