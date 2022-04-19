package xssfworkbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven1 {
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Akashraj.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
}
}
