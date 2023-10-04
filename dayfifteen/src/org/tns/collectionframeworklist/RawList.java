//collection interface have--> 3 interfaces (list, set, queue)
// this 3 interface then derived by classes
// 1. interface list have classes (ArrayList, LinkedList,

// characteristics of list
/* */

// Program to demonstrate ArrayList (Hetrogenous (allows any type of datatype))
package org.tns.collectionframeworklist;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RawList {

	public static void main(String[] args) {
		
	//  List listone = new List();   // As list is a interface so we can;t create a object of list
		
		// so we are doing like this
		// creating (hetorgenius arraylist)  also called as raw type of list
		List listOne = new ArrayList();      // polymorphic behaviour
		
		// adding different types of elemet's to list
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.78f);
		listOne.add("Hello");
		listOne.add(new String("Hi"));
		
		// displaying the elements of list  (there is a inbuild  method which have for loop for displaying)
		System.out.println(listOne);
		
		// some default and static method's of collection interface
		// interface can contain method's like default and static
		Collections.sort(listOne);        // as collention is hetrogenous 
		                                // we cannot sort the elements with different datatypes so we this line throws the class cast exception

	}

}
