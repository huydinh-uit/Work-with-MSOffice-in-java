package Practice;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DocApp {
    public static void main(String[] args) throws Exception {
        String path = "D:\\test.xlsx";
//        new CreateFirstDoc();
//        new ImportFromExcelUsingAspose();


        FileInputStream fis = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);
        /**
             *getLastRowNum() will get the index of last row defined in the sheet
             * and indexing starts from 0.
             * so, if there are 10 rows in the sheet, this method will return 9
         */
        System.out.println("No. of rows : " + sheet.getLastRowNum());
        /**
             * getPhysicalNumberOfRows() will get the total number of rows
             *in the sheet that contain data
             *so, if there are 10 rows in the sheet and 2 rows are blank,
             *it will return 8
         **/

    }
}