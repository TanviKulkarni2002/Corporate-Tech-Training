import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public Object[][] getallData() {
        String excelFilePath = "data.xlsx";
        Object[][] data = null;

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = getCellValue(cell);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private Object getCellValue(Cell cell) {
                return cell.getStringCellValue();
            
    }

    public static void main(String[] args) {
        ExcelReader reader = new ExcelReader();
        Object[][] data = reader.getallData();

        for (Object[] row : data) {
            for (Object value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
