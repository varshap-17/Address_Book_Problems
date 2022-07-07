package addressbook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressbookUC5 {
	public static void main(String[] args) {
		Contacts p1=new Contacts("sona","ramesh","k.r.puram","hassan","karnataka",573201,973163,"sona@gmail.com");
		Contacts p2=new Contacts("varu","kumar","v,r.colony","mysore","karnataka",573202,888054,"varu@gmail.com");
		ArrayList<Contacts>ab=new ArrayList<Contacts>();
		ab.add(p1);
		ab.add(p2);
		//getting iterator
		Iterator itr=ab.iterator();
		//traversing
		while(itr.hasNext()) {
			Contacts person=(Contacts)itr.next();
			System.out.println(person.fname + " " + person.lname+" " +person.address+" "+person.city+" "+person.state+" "+person.pin+" "+person.phno+" "+person.email);
		}
	}
}
