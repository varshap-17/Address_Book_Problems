package adb.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Addressbookuc12 {
		static Scanner input = new Scanner(System.in);
	    static String[] info;
	    static String name, addressBookName, firstName;
	    static ArrayList<String> namelist = new ArrayList<>();
	    static ArrayList<String> firstNameList  = new ArrayList<>();
	    static ArrayList<String> stateCitynameList = new ArrayList<>();
	    static ArrayList<String>  personNameList = new ArrayList<>();
	    @SuppressWarnings("rawtypes")
		static HashMap<String, HashMap> addressbooks = new HashMap<>();
	    static HashMap<String, String[]> contacts = new HashMap<>();
	    static HashMap<String, String> city = new HashMap<>();
	    static HashMap<String, String> state = new HashMap<>();
	    static String[] contact = new String[8];
	    static int index;
	    static int numOfContacts = 0;
	    
	    // Taking all details input in an array
	    public static String[] contactDetailsInput() {
	        System.out.println("Enter your details accordingly \n1. First Name\n2. Last Name\n"
	                + "3. House number\n4. City\n5. State\n6. Pin Code\n" +
	                "7.  Phone number\n8. e-mail");
	        for (int index = 0; index < contact.length; index++) {
	            System.out.print((index + 1)  + ".");
	            if (index == 0) {
	                firstNameDuplicacyCheck();
	            } else
	                contact[index] = input.next();
	        }
	        contacts.put(name, contact);
	        addressbooks.put(addressBookName, contacts);
	        city.put(contact[0], contact[3]);
	        state.put(contact[0], contact[4]);
	        stateCitynameList.add(contact[3]);
	        stateCitynameList.add(contact[4]);
	        numOfContacts++;
	        return contact;
	    }
	    // To check if First name is already in some other contact name
	    public static void firstNameDuplicacyCheck() {
	        boolean check = true;
	        while(check) {
	            firstName = input.next();
	            if (firstNameList.contains(firstName))
	                System.out.println("Name already exist,Try another name");
	            else {
	                firstNameList.add(firstName);
	                contact[0] = firstName;
	                check = false;
	            }
	        }
	    }
	    // To update the contact details if enquired for
	    public static String[] updateContactDetails(String[] contact) {
	        System.out.println("Press the respective number you want to edit\n" +
	                "1  First Name\n2 Last Name\n3 House no.\n4 City\n5 State\n" +
	                "6 Pin Code\n7 phone number\n8 email");
	        int choose = input.nextInt();
	        if (choose >= 1 && choose <= 8) {
	            choose--;
	            System.out.println("Enter the new details you choosed to edit");
	            contact[choose] = input.next();
	        }
	        return contact;
	    }
	    // To check whether what actions do we need to perform
	    @SuppressWarnings("unchecked")
		public static void checkActions() {
	        boolean bool = true;
	        int action;
	        while(bool) {
	            System.out.println("Enter valid name of the address book where you stored the contact");
	            name = input.next();
	            if (namelist.contains(name)) {
	                contacts = addressbooks.get(name);
	                while (bool) {
	                    System.out.println("Type the following numbers if you want to perform the corresponding action");
	                    System.out.println("1. EDIT\n2. DELETE\n3. ADD NEW CONTACT\n4. Total Number of Contacts\nAnyNumber. EXIT");
	                    action = input.nextInt();
	                    switch (action) {
	                        case 1:
	                            System.out.println("Enter your unique contact name");
	                            name = input.next();
	                            if (namelist.contains(name)) {
	                                info = contacts.get(name);
	                                info = updateContactDetails(info);
	                            }
	                            printContactDetails(info);
	                            break;
	                        case 2:
	                            System.out.println("Enter your  unique contact name");
	                            name = input.next();
	                            if (namelist.contains(name))
	                                namelist.remove(name);
	                            break;
	                        case 3:
	                            System.out.println("Enter a new contact name");
	                            name = addUniqueName();
	                            info = contactDetailsInput();
	                            for (int index = 0; index < info.length; index++)
	                                System.out.println(info[index]);
	                            break;
	                        case 4:
	                            System.out.println("Total Number of Contacts are " + numOfContacts);
	                        default:
	                            bool = false;
	                    }
	                }
	                bool = true;
	            }
	            else {
	                System.out.println("Press the following: \n1. Add New Addressbook\n" +
	                        "2. Existing Address Book\n3. To Search person in a State or City\nAny Number. Exit ");
	                action = input.nextInt();
	                switch(action) {
	                    case 1:
	                        programStart();
	                        break;
	                    case 2:
	                        break;
	                    case 3:
	                        searchPersons();
	                        break;
	                    default:
	                        bool = false;
	                }
	            }
	        }
	    }
	    // To check if the names of the multiple address book and contacts list created does not get repeated.
	    public static String addUniqueName() {
	        boolean check = true;
	        while(check) {
	            name = input.next();
	            if (namelist.contains(name))
	                System.out.println("Name already exist.Please try again with another name");
	            else {
	                namelist.add(name);
	                check = false;
	            }
	        }
	        return name;
	    }
	    //This takes place at the start of the program or to add a new address book
	    public static void programStart() {
	        System.out.println("Enter a unique name for your Address Book");
	        addressBookName = addUniqueName();
	        System.out.println("Enter a unique name for your contacts book");
	        name = addUniqueName();
	        info = contactDetailsInput();
	    }
	    // For printing contact details
	    public static void printContactDetails(String[] info) {
	        for (index = 1; index <= info.length; index++) {
	            System.out.println(index + ". " + info[index]);
	        }
	    }
	    // To search person by the name of city or state
	    
	    @SuppressWarnings("rawtypes")
		public static void searchPersons() {
	        personNameList = new ArrayList<>();
	        System.out.println("Enter the corresponding number \n1. city\n 2. state\n" +
	                "To search persons in them");
	        switch(input.nextInt()) {
	            case 1:
	                System.out.println("Enter the city name");
	                name = input.next();
	                if (stateCitynameList.contains(name)) {
	                    for (Map.Entry<String, String> firstName:city.entrySet()) {
	                        if ( firstName.getValue().equals(name))
	                            System.out.println(firstName.getKey());
	                    }
	                }
	                else { System.out.println("Invalid Name");}
	                break;
	            case 2:
	                System.out.println("Enter the state name");
	                name = input.next();
	                if (stateCitynameList.contains(name)) {
	                    for (Map.Entry getFirstName:state.entrySet()) {
	                        if (getFirstName.getValue().equals(name))
	                            System.out.println(getFirstName.getKey());
	                    }
	                }
	                else { System.out.println("Invalid Name");}
	                break;
	            default:
	                System.out.println("Invalid Input.Exiting, Try Again");
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("WELCOME to Address Book Program");
	        programStart();
	        checkActions();
	        System.out.println("******THANK YOU******");
	    }	
}
