package EXCELDREAD_WRITE;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT2 {

	public static void main(String[] args) {
		Write();
	}
	private static void Write()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		try
		{
			wb= new XSSFWorkbook();
			sh= wb.createSheet();
			String s[]= {"GREEN","RED","VIOLET","INDIGO","BLUE","YELLOW","ORANGE","WHITE","BLACK","BROWN","GREY","SAFFRON","MARRON","LAVENDER","PINK","PARROTGREEN","CRIMSON RED","PALE YELLOW","RAMA GREEN","DARK BLACK","SNOW WHITE"};
			
			row =sh.createRow(9);
			
			for(int i=0;i<s.length;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue(s[i]);
			}
			
			fout= new FileOutputStream("G:\\EXCEL\\Colours20.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
