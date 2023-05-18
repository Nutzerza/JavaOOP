import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
class GetDataExcel {
    private double totalP, totalC;
    private DefaultListModel<String> cartListModel;
    public double gettotolP() {
        return this.totalP;
    }
    public void setCartListModel(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;
    }
    public void getData() {
        try (Workbook data1 = new XSSFWorkbook("data.xlsx")){
            Sheet sheet = data1.getSheet("Stock");
            for(int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                Cell cellName = row.getCell(1);
                Cell cellCost = row.getCell(2);
                Cell cellPrice = row.getCell(3);
                for(int i=0; i<cartListModel.size(); i++){
                    if(cellName.getStringCellValue().equals(cartListModel.get(i))){
                        switch (cellPrice.getCellType()) {
                            case STRING:
                                totalP += Double.parseDouble(cellPrice.getStringCellValue());
                                break;
                            case NUMERIC:
                                totalP += cellPrice.getNumericCellValue();
                                break;
                            default:
                                totalP += 0;
                                break;
                        }
                        switch (cellCost.getCellType()) {
                            case STRING:
                                totalC += Double.parseDouble(cellCost.getStringCellValue());
                                break;
                            case NUMERIC:
                                totalC += cellCost.getNumericCellValue();
                                break;
                            default:
                                totalP += 0;
                                break;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void decreaseAmount() {
        try (FileInputStream fileInputStream = new FileInputStream("data.xlsx");
            Workbook data1 = new XSSFWorkbook(fileInputStream);) {
            Sheet sheet = data1.getSheet("Stock");
            for(int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                Cell cellName = row.getCell(1);
                Cell cellAmount = row.getCell(4);
                for(int i=0; i<cartListModel.size(); i++){
                    if(cellName.getStringCellValue().equals((String)cartListModel.get(i))){
                        switch (cellAmount.getCellType()) {
                            case STRING:
                                cellAmount.setCellValue(Double.parseDouble(cellAmount.getStringCellValue())-1);
                                break;
                            case NUMERIC:
                                cellAmount.setCellValue(cellAmount.getNumericCellValue()-1);
                                break;
                            default:
                                totalP += 0;
                                break;
                        }
                    }
                }
            }
            try (FileOutputStream fos = new FileOutputStream("data.xlsx");) {
                data1.write(fos);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void setStandard(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;
        totalP = 0;
        totalC = 0;
    }
}
