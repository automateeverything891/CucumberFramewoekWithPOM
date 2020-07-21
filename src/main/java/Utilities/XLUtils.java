package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils extends TestBase{

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
 	public static int getRowCount(String xlFile,String xlSheet) throws IOException {
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		}
	
 	public static int getCellCount(String xlFile,String xlSheet,int rownum) throws IOException {
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		}
	
 	public static String getCellData(String xlFile,String xlSheet,int rownum,int colnum) throws IOException {
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try {
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
			}
		catch(Exception e){
			data="";
			}
		
		wb.close();
		fi.close();
		return data;
		}
 	
 	
 	public static void setCellData(String xlFile,String xlSheet,int rownum,int colnum,String data) throws IOException {
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		XSSFCellStyle style = wb.createCellStyle();  
		
		if(colnum==-1)
			
			row = ws.getRow(rownum);
			if (row == null)
			row = ws.createRow(rownum);
			
			cell = row.getCell(colnum);
			if (cell == null)
			       cell = row.createCell(colnum);

			  
			   if (data=="PASS") {
				   cell.setCellValue(data);
				   style.setFillForegroundColor(IndexedColors.GREEN.getIndex()); 
				   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				   cell.setCellStyle(style);
				   
			   }
			   else if (data=="FAIL") {
				   cell.setCellValue(data);
				   style.setFillForegroundColor(IndexedColors.RED.getIndex()); 
				   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				   cell.setCellStyle(style);
				   
			   }
			   else if (data=="SKIP") {
				   cell.setCellValue(data);
				   style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
				   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				   cell.setCellStyle(style);
				   
			   }
			   else if (data=="Invalid status") {
				   cell.setCellValue(data);
				   style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
				   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				   cell.setCellStyle(style);
			   }
			   
			fo=new FileOutputStream(xlFile);
			
			wb.write(fo);
			wb.close();
			fi.close();
			fo.close();
		
		}
 	
 	public static int current_Row;
 	public static String xlFile=System.getProperty("user.dir")+"\\src\\test\\java\\com\\RestAPI\\testdata\\TestDataWithValidation.xlsx";
 	public static String xlSheet="Validation";
 	
 	public static Object[][] getData() throws Exception{
 		int testStartRow=0;
 		
// 		Object [][] data=new Object[getRowCount(xlFile, xlSheet)][getCellCount(xlFile, xlSheet, testStartRow)];
 		Object [][] data=new Object[getRowCount(xlFile, xlSheet)][1];
 		
 		System.out.println(getRowCount(xlFile, xlSheet));
 		System.out.println(getCellCount(xlFile, xlSheet, testStartRow));
 		
 		Hashtable<String, String> table =null;
 		
 		for (int i =1; i <= getRowCount(xlFile, xlSheet); i++) {
 			table = new Hashtable<String, String>();
 			current_Row=i;
 			for (int j = 0; j <(getCellCount(xlFile, xlSheet, testStartRow)-1); j++) {
				table.put(getCellData(xlFile, xlSheet, testStartRow, j), getCellData(xlFile, xlSheet, i, j));
				
//				System.out.println(getCellData(xlFile, xlSheet, testStartRow, j) + "----->"+getCellData(xlFile, xlSheet, i, j));
				
			}
 			data[(i-1)][0]=table;
		}
 		
 		return data;
 	}
 	
 	
 	
}
