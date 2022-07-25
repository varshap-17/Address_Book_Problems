package adb.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class AddressbookUC9 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		Map<String,String> map1=new HashMap<>();
		System.out.println("Dictonary of City and Person");
		map.put("Mysore","Raavi");
		map.put("Banglore", "Vanshika");
		map.put("Hassan", "Anaya");
		System.out.println(map);
		
		System.out.println("\nDictonary of State and Person");
		map1.put("Karnataka","Bhuvi");
		map1.put("Tamilnadu", "Vrushubhi");
		map1.put("NewDelhi","Inchara" );
		System.out.println(map1);
	}
}
