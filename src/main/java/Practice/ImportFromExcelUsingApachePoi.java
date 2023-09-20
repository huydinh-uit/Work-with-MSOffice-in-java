//package Practice;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class ImportFromExcelUsingApachePoi {
//    public static String path ="D:\\Exname.xlsx";
//
//    ArrayList<Employee> employees = new ArrayList<Employee>();
//
//    public void importFromExcelUsingApachePoi() throws IOException {
//        FileInputStream fis = new FileInputStream(path);
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        XSSFSheet sheet = wb.getSheetAt(0);
//        System.out.println("No. of rows : " + sheet.getLastRowNum());
//    }
//}
