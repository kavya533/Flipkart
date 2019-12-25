package generic_lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericDDT implements Framework_Constants{

	public String fetchDataFromExcel(String sheet, int row, int cell)
	{
		String val = null;
		try
		{
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		val=c.toString();
		}
		catch(Exception e)
		{
			System.out.println("Cannot fetch value");
		}
		return val;
		
	}
	
	public void writeDataToExcel(String path, String sheet, int row, int cell, String data)
	{
		
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).createCell(cell);
			c.setCellValue(data);
			FileOutputStream fout= new FileOutputStream(path);
			wb.write(fout);
			
		} 
		catch (Exception e) {
			
		}
		
	}
	
	
}
