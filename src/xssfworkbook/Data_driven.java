package xssfworkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Akashraj.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet sheet = w.getSheetAt(0);
		XSSFRow r1 = sheet.getRow(0);
		System.out.println(r1.getCell(0));
		System.out.println(sheet.getLastRowNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print("  " + sheet.getRow(i).getCell(j));
			}
			System.out.println();
		}

		FileOutputStream f1 = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\Akashraj.xlsx");

		Iterator<Row> s = sheet.iterator();

		while (s.hasNext()) {
			Row r2 = s.next();
			Iterator<Cell> r = r2.iterator();
			while (r.hasNext()) {

				System.out.print("  " + r.next());
			}
			System.out.println();
		}
	}

}