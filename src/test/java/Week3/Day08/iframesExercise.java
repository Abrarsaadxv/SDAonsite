package Day08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class iframesExercise {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
    }

    @Test
    public void test() {
//    Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

//    Maximize the website.

//    Click on the second emoji.
        driver.switchTo().frame("emoojis"); // now were inside the iframe
//        driver.findElement(By.id("tooltip-0f1n1a")); // bad way of locating and element
       By animelemojis= By.xpath("//div[@class='mdl-tabs__tab-bar']/a") ; // better way
       List<WebElement> list1 = driver.findElements(animelemojis);


//    Click on all second emoji items.
//    Return to the parent iframe.
        driver.switchTo().defaultContent();
//    Fill out the form (Fill the form with the text you want) and press the apply button.
        driver.findElement(By.id("smiles")).sendKeys("anamil");


    }
}
