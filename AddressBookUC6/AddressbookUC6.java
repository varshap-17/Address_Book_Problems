package addressbook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressbookUC6 {
	public static void main(String[] args) {
		Addbook a1=new Addbook("person1","person2","person3");
		Addbook a2=new Addbook("personA","personB","personC");
		ArrayList<Addbook>ab=new ArrayList<Addbook>();
		Contacts p1=new Contacts("sona","ramesh","k.r.puram","hassan","karnataka",573201,973163,"sona@gmail.com");
		Contacts p2=new Contacts("varu","kumar","v,r.colony","mysore","karnataka",573202,888054,"varu@gmail.com");
		ArrayList<Contacts>con=new ArrayList<Contacts>();
		ab.add(a1);
		ab.add(a2);
		con.add(p1);
		con.add(p2);
		//getting iterator
		Iterator itr=ab.iterator();
		Iterator itr1=con.iterator();
		//traversing
		while(itr.hasNext()) {
			Addbook person1=(Addbook)itr.next();
			System.out.println(itr.next());
			System.out.println(person1.contact1+ " "+person1.contact2+ " "+person1.contact3);
	}
		while(itr1.hasNext()) {
			Contacts person=(Contacts)itr1.next();
			System.out.println(itr1.next());
		}
 }
}
