package adb.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class AddressbookUC7 {
	public static void main(String[] args) {
		System.out.println("Persons in Address book");
		Set<String> set=new HashSet<>();
		Set<String> set1=new HashSet<>();
		set.add("Raavi");
		set.add("Vanshika");
		set.add("Anaya");
		System.out.println(set);
		set1.add("Raavi");
		System.out.println(set1);
		
		boolean value=set.equals(set1);
		System.out.println(value);
		System.out.println("Raavi is duplicate element");
	}
}
