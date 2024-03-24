package Day05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class C01ChromeOptions {
    /*
 ChromeOptions Class

It is a concept used in Selenium WebDriver to modify various properties of the Chrome driver.
start-maximized: Opens Chrome in maximize mode.
incognito: Opens Chrome in incognito mode.
headless: Runs Chrome in headless mode (without displaying).
disable-extensions: Disables existing extensions in the Chrome browser.
disable-popup-blocking: Disables pop-up blocking in the Chrome browser.
make-default-browser: Sets Chrome as the default browser.
version: Prints the Chrome browser version.
disable-infobars: Prevents Chrome from displaying the "Chrome is being controlled by automated software" notification.
*/
    static WebDriver driver;

    @Test
    public void test() {
        ChromeOptions options= new ChromeOptions();
        //start-maximized: Opens Chrome in maximize mode.
        options.addArguments("start-maximized");
        //incognito: Opens Chrome in incognito mode.
        options.addArguments("incognito");
        //headless: Runs Chrome in headless mode (without displaying).
        //options.addArguments("headless");
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");


        driver = new ChromeDriver(options);
        driver.get("https://google.com");

    }

    @AfterClass
    public static void tearDown(){
        driver.close();
        driver.quit();
    }



}
