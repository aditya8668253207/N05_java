// Program to demonstrate ArrayList
/*Characteristics of ArrayList
 * 1) */
package org.tns.collectionframeworklist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		// creating homogenous list of integers (ArrayList)
		List<Integer> intList = new ArrayList<Integer>();
	
		// adding elements to ArrayList
		intList.add(10);
		intList.add(17);
		intList.add(6);
		intList.add(41);
		intList.add(11);
		
		// displaying the ArrayList
		System.out.println(intList);

		// some default and static methods of Collection Interface
		Collections.sort(intList);   // sort method
		System.out.println("----After Sorting-----");
		System.out.println(intList);
		
		Collections.reverse(intList);     // reverse method
		System.out.println("---After Reverseing---");
		System.out.println(intList);
	
		// some method of List Interface
		intList.add(2, 50 );   // at index 2 the element 50 is inserted  add(index, element)
		                         // and the elements are shifted toward's right automatically
		System.out.println("-- After inserting 50 to the 2nd index ---");
		System.out.println(intList);
		
		// contains method
		System.out.println(intList.contains(10));   // return's true or false based on value is present of not
		System.out.println(intList.contains(100)); 
		
		// remove mehotd
		System.out.println("Remove elment at index 5 : "+intList.remove(5));   // it remove element which is present at index 1
	    System.out.println(intList);                         // and display's removed element
	    
	    // remove method to remove the direct element without using index
	    System.out.println("remove element 41 : "+intList.remove(intList.indexOf(41)>=0?"Index is present":"index is not present"));
		
		
		
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()) {
			int no = it.next();
			System.out.println(no+" : "+no*no);
		}
		
		// clear method
				intList.clear();  // remove all the element's from list
				System.out.println("--After using celar method : "+intList);
				
	}

}
