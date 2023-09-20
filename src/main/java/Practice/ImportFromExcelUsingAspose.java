package Practice;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

import java.util.ArrayList;

public class ImportFromExcelUsingAspose {
    public static String path ="D:\\Exname.xlsx";



    ArrayList<Employee> employees = new ArrayList<Employee>();

    public ImportFromExcelUsingAspose() throws Exception {
        Workbook wb = new Workbook(path);

        // Get reference of the worksheet
        Worksheet worksheet = wb.getWorksheets().get(0);

        // Get row and column count
        int rows = worksheet.getCells().getMaxDataRow() +1;
        int cols = worksheet.getCells().getMaxDataColumn() +1;

        // Loop through rows
        for (int i = 0; i < rows; i++) {

            // Loop through each column in selected row
            for (int j = 0; j < cols; j++) {
                Employee employee = new Employee();
                // Print cell value
                employee.setName(worksheet.getCells().get(i, j).getStringValue());
                employees.add(employee);

            }
            System.out.println(employees.get(i).getName());
        }
    }
}
