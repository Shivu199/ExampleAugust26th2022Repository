package EXCELDREAD_WRITE;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSINMENT5 {

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
			String s[]= {"Benagaluru","Mysuru","Hyderabad","Chennai","Delhi","Kalaburgi","SHivamogga","Tumakuru","Thrissur","Thiruvanathpur","Madurai","Kochi","Hassan","Dharwad","Mandya","Udupi","Dindigul"};

			for(int i=0;i<s.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(5);

				cell.setCellValue(s[i]);
			}

			fout=new FileOutputStream("G:\\EXCEL\\City.xlsx");
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
