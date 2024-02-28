package Day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Task01Day5 {


    //Task 1:
    //Go to URL: https://demoqa.com/radio-button
    //Verify whether all 3 options given to the question can be selected.
    //When each option is selected, print the following texts on the console.


    @Test
    public void test1(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

        // Find radio button elements
        List<WebElement> radioButtons = driver.findElements(By.id("yesRadio"));
        radioButtons.get(0).click();
        // Print whether the first radio button is selected
        System.out.println("the 1fs radio button selected? " + radioButtons.get(0).isSelected());
       // Assert.assertTrue(radioButtons.isDisplayed());
        //List<WebElement>radioButtons2=driver.findElements();



    }
}


//if(radiobutt.get(0).isSelected()){
//    radiobutt.get(0).click();
//    System.out.println("1st is selected ");
//}
//        Assert.assertTrue(radiobutt .get(0).isSelected());

//        List<WebElement>radiobutt2=driver.findElements(By.id("impressiveRadio"));
//        System.out.println(radiobutt2.get(1).isSelected());
//        List<WebElement>radiobutt3=driver.findElements(By.id("noRadio"));
//        System.out.println(radiobutt.get(2).isSelected());



//        System.out.println("The first one can be selected ");
//        radiobox.get(1).click();
//        Assert.assertTrue(radiobox.get(1).isSelected());
//     System.out.println("The 2nd one can be selected ");
//        radiobox.get(3).click();
//        Assert.assertTrue(radiobox.get(3).isSelected());
//        System.out.println("The 3d one can be selected ");
//


