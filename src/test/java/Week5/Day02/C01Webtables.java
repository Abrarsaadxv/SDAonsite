package Week5.Day01.Day02;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class C01Webtables  extends TestBase {


    @Test
    public void test01() {

        //Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        //To find third row of table
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class = 'dataTable']//tbody//tr[3]"));


        //To get 3rd row's 2nd column data
        WebElement thirdRowSecondData = thirdRow.findElement(By.xpath(".//td[2]"));
        System.out.println(thirdRowSecondData.getText());

        //Get all the values of a Dynamic Table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'dataTable']//tbody//tr"));
        List<WebElement> cells = new ArrayList<>();

        List<String> allData = new ArrayList<>();

        for (WebElement w : rows) {
            cells = w.findElements(By.xpath(".//td"));
            for (WebElement y : cells)
                allData.add(y.getText());
        }

        System.out.println(allData);

        //------------------------------------------

        //2nd Approach

        List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        for (WebElement row : rows1) {
            // Find all columns in each row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Iterate through each column
            for (WebElement column : columns) {
                // Print the text of each column
                //System.out.print(column.getText() + "\t");
            }
            System.out.println();

            //fot loop

            for (int i = 0; i < rows.size(); i++) {
                List<WebElement> rowsData = rows.get(i).findElements(By.tagName("td"));
                int columensize = rowsData.size();
                for (int j = 0; j < columensize; j++) {

                    System.out.println(rowsData.get(j).getText() + " ");
                }
              //  System.out.println();
            }


        }
    }
}
