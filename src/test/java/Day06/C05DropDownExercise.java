package Day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C05DropDownExercise {
    //https://demoqa.com/select-menu
    //Get all the options of the dropdown
    //Options size
    //Print all test
    //Verify the dropdown has option "Black"
    //Print FirstSelectedOptionTest
    //Select option "Yellow"
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }

    @Test
    public void test() {
        //Get all the options of the dropdown

        WebElement elemnt1= driver.findElement(By.id("oldSelectMenu"));
        Select select1 = new Select(elemnt1);

        //Options size
       List<WebElement> options = select1.getOptions();
 int sizeoptions = options.size();

        //Print all test
        for (WebElement opthioncolor:options){
            System.out.println("opthion.getText() = " + opthioncolor.getText());
        }
        // using for loop
       // for(int i=0;i<options.size();i++){
         //   System.out.println(" " + options.get(i).getText());}


        //Verify the dropdown has option "Black"

        List<String> colorList = new ArrayList<>();
        for (WebElement option :options){
            colorList.add(option.getText());
        }
        Assert.assertTrue(colorList.contains("Black"));
        // Print FirstSelectedOptionTest
select1.getFirstSelectedOption().getText();
// Select option "Yellow"
        select1.selectByVisibleText("Yellow");


    }
}
