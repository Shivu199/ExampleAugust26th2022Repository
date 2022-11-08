package EXCELDREAD_WRITE;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSINMENT4 {

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
			wb=new XSSFWorkbook();
			sh=wb.createSheet("States");
			String s[]= {"Karnataka","TamilNadu","Kerala","AndhraPradesh","Telangana","Goa","Maharashtra","Gujurath","Rajasthan","Maharashtra","MadhyaPradesh","Chattisgarh","Bihar","Assam","Meghalaya","Tripura","Mizoram","Nagaland","Manipur","Sikkim"};
			
			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				
				cell.setCellValue(s[i]);
			}
			
			fout=new FileOutputStream("G:\\EXCEL\\States.xlsx");
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
