package exp.bridgelabz;

import java.io.File;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class ADBwriteuc14 {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\VARSHA P\\Desktop\\eclipse-workspace\\bridgelabz\\src\\write.csv");
		try {
			FileWriter fw=new FileWriter(file);
			CSVWriter writer=new CSVWriter(fw);
			String[] header= {"First name","Last name","Address","City","State","Zip","Phone number","Email"};
			writer.writeNext(header);
			String[] data= {"Namitha","R","Basvangudi","Banglore","Karnataka","4","5846329142","nami@gmail.com"};
			writer.writeNext(data);
			String[] data1= {"Spoorthi","N","K.R.Colony","Hassan","Hydrabadh","6","9535083136","spoo@gmail.com"};
			writer.writeNext(data1);
			String[] data2= {"Jwalashree","GN","K.Mohalla","Mysore","Karnataka","8421","9108168484","jwa@gmail.com"};
			writer.writeNext(data2);
			String[] data3= {"Kavya","DN","Hemavathi nagar","Manglore","Kerala","564","8296147531","kav@gmail.com"};
			writer.writeNext(data3);
			writer.flush();
			writer.close();
			
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
