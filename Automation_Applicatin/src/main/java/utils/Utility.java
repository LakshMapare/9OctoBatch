package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Utility {
	 static String path = "D:\\Laxmikant Data\\Handle excell.xlsx";
	public static void getDataFromDataSheet(int row,int cell) throws EncryptedDocumentException, IOException{ 
        FileInputStream file = new FileInputStream(path);
           try {
        	   String value = WorkbookFactory.create(file).getSheet("Velocity").getRow(row).getCell(cell).getStringCellValue();
        	   
        	
           }
           catch{
        	   
        	   
           }
	}

}
