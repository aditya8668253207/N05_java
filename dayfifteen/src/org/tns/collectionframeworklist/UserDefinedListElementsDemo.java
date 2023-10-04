package org.tns.collectionframeworklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserDefinedListElementsDemo {

	public static void main(String[] args) {
		
		// creating ArrayList of type Employee
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		// adding elements to ArrayList as a object's of Employee class
		empList.add(new Employee(101, "Nikita", 56000, "Java Developer"));
		empList.add(new Employee(102, "Anita", 66000, "Sr. Java Developer"));
		empList.add(new Employee(103, "Prajakta", 36000, "Jr. Java Developer"));
		
		System.out.println(empList);
		
		Collections.sort(empList); 
		// we get compile time error for this : The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Employee>)

		// we inherit the employee class from interface comparatble and ovverride the method compareto to use the sort method
		System.out.println(empList);
		

	}

}
