package addressbook;

public class Contacts {
	String fname;
	String lname;
	String address;
	String city;
	String state;
	int pin;
	int phno;
	String email;
	Contacts(String fname,String lname,String address,String city,String state,int pin,int phno,String email){
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.pin=pin;
		this.phno=phno;
		this.email=email;
	}
}
