package EXCELDREAD_WRITE;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSINMENT3 {

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
			sh=wb.createSheet("Flowers");
			String s[]= {"Rose1","Rose2","Rose3","Jasmine1","Jasmine2","Jasmine3","Jasmine5","Sampige","Sampige2","Hibiscus1","Hibiscus2","Daisy","Daisy2","MarieGold1","MarieGold2","Sunflower1","Sunflower2","NeelaKuranji","saffron","kanakambara"};
			String s1[]= {"GREEN","RED","VIOLET","INDIGO","BLUE","YELLOW","ORANGE","WHITE","BLACK","BROWN","GREY","SAFFRON","MARRON","LAVENDER","PINK","PARROTGREEN","CRIMSON RED","PALE YELLOW","RAMA GREEN","DARK BLACK","SNOW WHITE"};
			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(s[i]);
				
				cell =row.createCell(1);
				cell.setCellValue(s1[i]);
			}	
			fout=new FileOutputStream("G:\\EXCEL\\FlowersandColours.xlsx");
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
