package addressbook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressbookUC2{
	public static void main(String[] args) {
		System.out.println("AddressBook List");
		System.out.println("New Contact Person");
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("Namitha");
		ab.add("Ramesh");
		ab.add("vijya nagar");
		ab.add("Banglore");
		ab.add("Karnataka");
		ab.add("4");
		ab.add("9731634401");
		ab.add("nami@gmail.com");
		Iterator itr=ab.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
  }	
}
