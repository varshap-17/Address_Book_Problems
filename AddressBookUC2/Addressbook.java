package addressbook;

import java.util.ArrayList;
import java.util.Iterator;
                      
     public class Addressbook {
    	 public static void main(String[] args) {
    		 //creating empty address book list with indexes
			System.out.println("AddressBook List");
			System.out.println("Index are");
			ArrayList<String> ab=new ArrayList<String>();
			ab.add("Firstname");
			ab.add("Lastname");
			ab.add("Address");
			ab.add("City");
			ab.add("State");
			ab.add("Pin");
			ab.add("Phone no");
			ab.add("Email-id");
			Iterator itr=ab.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
    }
  }    