package adb.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressbookUC8 {
	public static void main(String[] args) {
		System.out.println("Search a person in City or State");
		List<String> al=new ArrayList<>();
		al.add("Raavi");
		al.add("Vanshika");
		al.add("Anaya");
		System.out.println(al);
		int index=Collections.binarySearch(al, "Vanshika");
		System.out.println("the searched person in the list is: "+index);
	}
}
