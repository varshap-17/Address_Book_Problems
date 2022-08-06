package exp.bridgelabz;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class ADBread {
	public static void main(String[] args) {
		System.out.println("Contact Persons of Address book");
		try {
			Reader reader=Files.newBufferedReader(Paths.get("C:\\Users\\VARSHA P\\Desktop\\eclipse-workspace\\bridgelabz\\src\\read.csv"));
			CSVReader csvReader=new CSVReader(reader);
			String[] records=new String[5];
			while((records=csvReader.readNext())!=null) {
				System.out.println("firstName:"+records[0]);
				System.out.println("lastName:"+records[1]);
				System.out.println("address:"+records[2]);
				System.out.println("city:"+records[3]);
				System.out.println("state:"+records[4]);
				System.out.println("zip:"+records[5]);
				System.out.println("phonenum:"+records[6]);
				System.out.println("email:"+records[7]);
			}
		}catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
