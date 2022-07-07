package addressbook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressbookUC3 {
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
		System.out.println("Replacing the element---");
		//accessing the element
		System.out.println("returning the element:" +ab.get(0));
		//changing the element
		ab.set(0,"sona");
		for(String contacts:ab) {
			System.out.println(contacts);
		}
  }
}	
