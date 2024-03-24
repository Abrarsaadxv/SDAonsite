package Day02;

import com.google.j2objc.annotations.Weak;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02JunitAnnotations {
    /*
* *****ANNOTATIONS******
"There are 6 annotations commonly used:
@Test: Allows us to create an independent test that can run on its own. Return type -> void
@Before: Used for the method where preparations to be done before the test starts. It runs before each method.
@BeforeClass: Similar to @Before but runs only once at the beginning of the class, unlike @Before. Must be static.
@After: Runs after each test, performing functions such as closing after the test is done.
@AfterClass: Runs once at the end of each class, must be static.
@Ignore: Ensures that the annotated method is not executed. When the test is run, the report shows that this method is marked as ignored."

*/
    WebDriver deiver;

    @Before
    public void beforeEavhTesy() {

        deiver = new ChromeDriver();
        System.out.println("Before annotation is executed ");
    }

    @After
    public void AfterEavhTesy() {
        deiver.close();
        System.out.println("After Annotation executed .....");
    }

@Test
    public void test1 (){

        deiver.get("https:www.clarusway.com");
        System.out.println("Test1 is  executed .....");


    }


}
