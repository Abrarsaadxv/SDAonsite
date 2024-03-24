package Day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03Dropdown2 {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().fullscreen();

        driver.get("https://demoqa.com/select-menu");
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }


    @Test
    public void test(){
        // locate  Webelemnts selecte tag
        WebElement element =driver.findElement(By.id("oldSelectMenu"));
        // create a select object by passing select into constructor
        Select select = new Select(element);
        // select
        select.selectByIndex(3); // index 3 = 4th element which  is purple
        select.selectByValue("4");
        select.selectByValue("red");
        select.selectByVisibleText("Purple");
        // isMultiple() method returns true if we can select multiple options return false otherwise.
        System.out.println("select.isMultiple() = " + select.isMultiple());
        WebElement elemnt2 = driver.findElement(By.id("cars"));  // false --> cannot select multiple options
        Select select2 = new Select(elemnt2);
        System.out.println("select2.isMultiple() = " + select2.isMultiple());  // true --> can select multiple options

    }


}
