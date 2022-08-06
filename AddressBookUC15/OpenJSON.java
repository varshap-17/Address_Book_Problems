package exp.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenJSON {
	private static final String CSV_FILE_PATH="C:\\Users\\VARSHA P\\Desktop\\eclipse-workspace\\bridgelabz\\src\\read.csv";
	private static final String JSON_FILE_PATH="C:\\Users\\VARSHA P\\Desktop\\eclipse-workspace\\bridgelabz\\src\\abc.json";
	
	public static void main(String[] args) {
		try {
			Reader reader=Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
			CsvToBeanBuilder<CSVUser> csvToBeanBuilder=new CsvToBeanBuilder<>(reader);
			csvToBeanBuilder.withType(CSVUser.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<CSVUser> csvToBean=csvToBeanBuilder.build();
			List<CSVUser> csvuser=csvToBean.parse();
			Gson gson=new Gson();
			String json=gson.toJson(csvuser);
			FileWriter writer=new FileWriter(JSON_FILE_PATH);
			writer.write(json);
			writer.close();
			BufferedReader br=new BufferedReader(new FileReader(JSON_FILE_PATH));
			CSVUser[] usrObj=gson.fromJson(br, CSVUser[].class);
			List<CSVUser> csvuserlist=Arrays.asList(usrObj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
