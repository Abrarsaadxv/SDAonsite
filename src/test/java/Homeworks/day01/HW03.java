package Homeworks.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {

    public static void main(String[] args) {

//🡪 Go to the Amazon URL: https://www.youtube.com/
        //  Verify the page title contain the word "video"
        // close driver

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

    }
}
