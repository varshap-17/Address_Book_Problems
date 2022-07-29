package adb.bridgelabz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddressbookUC11 {
	public static void main(String[] args) {
		List<String> stringList=Arrays.asList("abhi","urmila","sonal","bhima","eli");
		System.out.println("Person's name in Ascending order");
		List<String> Sort=stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(Sort);
		System.out.println("\nPerson's name in Desending order");
		List<String> sort=stringList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);
		
	}
}	
