package org.tns.collectionframeworklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserDefinedListElementsDemoTwo {

	public static void main(String[] args) {
		
		// creating ArrayList of type Employee
		ArrayList<EmployeeTwo> emptwoList = new ArrayList<EmployeeTwo>();
		emptwoList.add(new EmployeeTwo(101, "Nikita", 56000, "Java Developer"));
		emptwoList.add(new EmployeeTwo(102, "Anita", 66000, "B Java Developer"));
		emptwoList.add(new EmployeeTwo(103, "Prajakta", 36000, " A Java Developer"));
		
		System.out.println(emptwoList);
		System.out.println("------ sort by name ------");
		Collections.sort(emptwoList, new SortByName()); 
		System.out.println(emptwoList);
		
		System.out.println("------ sort by designation ------");
		Collections.sort(emptwoList, new SortBydesignation()); 
		System.out.println(emptwoList);
		
		// sorting using lambda expression 
		


		
		

	}

}
