package Homeworks.Week1.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) {

        /*
Create main method
Create chrome driver
Open google home page: https://www.google.com
Print Title on page
Print Current URL on page
Close/Quit the browser
     */


        //*******************************************************
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("THE TITELE is :"+driver.getTitle());
        System.out.println(" The CurrentUrl is  : " + driver.getCurrentUrl());
        driver.quit();

        //*******************************************************



    }

}
