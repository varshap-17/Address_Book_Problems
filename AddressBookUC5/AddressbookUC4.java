package addressbook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressbookUC4 {
	public static void main(String[] args) {
		System.out.println("AddressBook List");
		System.out.println("Index are");
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
		System.out.println("Deleting the element-->firstname");
		ab.remove(0);
		for(String contacts:ab) {
			System.out.println(contacts);
		}
		}
}