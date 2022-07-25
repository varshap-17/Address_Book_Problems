package adb.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class Addressbookuc10 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		Map<String,String> map1=new HashMap<>();
		System.out.println("Dictonary of City and Person");
		map.put("Mysore","Raavi");
		map.put("Banglore", "Vanshika");
		map.put("Hassan", "Anaya");
		System.out.println(map);
		System.out.println("number of contact person i.e count by city is "+map.size());
		
		System.out.println("\nDictonary of State and Person");
		map1.put("Karnataka","Bhuvi");
		map1.put("Tamilnadu", "Vrushubhi");
		map1.put("NewDelhi","Inchara" );
		map1.put("Kerala","Sauparnika");
		System.out.println(map1);
		System.out.println("number of contact person i.e count by State is "+map1.size());
	}
}
