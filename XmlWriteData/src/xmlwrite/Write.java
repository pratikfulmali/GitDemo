package xmlwrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Users\\ANUJ\\Desktop\\pratik data\\New Microsoft Office Excel Worksheet.xlsx");
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet=workbook.createSheet("Test");
			
			for (int i = 0; i <=0; i++) {
				
				XSSFRow row=sheet.createRow(i);
				
				for (int j = 0; j <=0; j++) {
					row.createCell(j).setCellValue("Pratik");
					
					
				}
				
			}
			
for (int k = 1; k <=1; k++) {
				
				XSSFRow row=sheet.createRow(k);
				
				for (int l = 1; l <=1; l++) {
					row.createCell(l).setCellValue("Nilesh");
					
					
				}
				
			}


for (int m = 2; m <=2; m++) {

XSSFRow row=sheet.createRow(m);

for (int n = 2; n <=2; n++) {
			row.createCell(n).setCellValue("Rohit");
			
			
}

}
			workbook.write(file);
		}
		file.close();
		System.out.println("Programm is done");
		
	}

}
