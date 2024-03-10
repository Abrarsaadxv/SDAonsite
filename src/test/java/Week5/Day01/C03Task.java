package Week5.Day01;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03Task {
    @Test
    public void test01() throws IOException {

        String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + separator + "resources" + separator + "excelfile.xlsx";

        //Open the workbook.
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet1 = wb.getSheet("Sheet1");

        //Create a cell on the 3rd column (2nd index) on the first row.
        //Write "POPULATION" on that cell.
        Row row1 = sheet1.getRow(0);
        Cell r1c3 = row1.createCell(2);
        r1c3.setCellValue("POPULATION");


        //Find the number of used rows
        int rowsUsed = 0;
        while (true) {
            if (sheet1.getRow(rowsUsed).getCell(0) == null) {
                break;
            }
            rowsUsed++;
        }

        //Insert data into the 3rd column
        for (int i = 1; i < rowsUsed; i++) {
            Row row = sheet1.getRow(i);
            Cell cell = row.createCell(2);
            cell.setCellValue(i + "" + i + "" + i + "" + i);
           // sheet1.getRow(i).createCell(2).setCellValue(i + "" + i + "" + i + "" + i); can be writen as
        }
        //Write and save the workbook
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        //Close the file.
        //Close the workbook.
        wb.close();
        fos.close();
        fis.close();

    }
}
