package EXCELDREAD_WRITE;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSINMENT6 {

	public static void main(String[] args) {
		Read();
	}
	private static void Read()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin= new FileInputStream("G:\\EXCEL\\Country20.xlsx");
			wb= new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc= sh.getPhysicalNumberOfRows();

			String s[]= new String[rc];

			for(int i=0;i<rc;i++)
			{
				row= sh.getRow(i);
				cell =row.getCell(0);

				String s1=cell.getStringCellValue();
				s[i]=s1;
				System.out.println(s[i]);
			}

			sh=wb.createSheet("Sheet2");

			for(int k=0;k<s.length;k++)
			{
				row =sh.createRow(k);
				cell=row.createCell(0);

				cell.setCellValue(s[k]);
			}

			fout= new FileOutputStream("G:\\EXCEL\\Country20.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			finally
			{
				try
				{

                    fin.close();
			    	fout.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
}
