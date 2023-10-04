/*Program to demonstrate Linked List*/
package org.tns.collectionframeworklist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		// creating linked list of type string
		// List<String> strList = new LinkedList<String>();
		LinkedList<String> strList = new LinkedList<String>();

		
		// adding elements to linked list
		strList.add("Pooja");
		strList.add("Zaashi");
		strList.add("Sharad");
		strList.add("Ankit");
		strList.add("Dhruv");
		
		System.out.println(strList);

		// method's of linked list
		// addFirst, addLast
		strList.addFirst("Neha");
		strList.addLast("Sanskruti");
		
		System.out.println(strList);
		
		//getFirst, getLast
		System.out.println("First element is " + strList.getFirst());
		System.out.println("Last element is " + strList.getLast());

		// remove
		System.out.println(strList.remove(2) + " Removed");
		System.out.println("Is pooja Removed from list : "+strList.remove("Pooja"));
		System.out.println(strList);
		
		// removeFirst, Remove last
		strList.removeFirst();
		System.out.println(strList);
		
		// sort
		Collections.sort(strList);
		System.out.println(strList);
		
		// Iterator
		// list iterator have methods like add set where arraylist iterator does not have it
		// forward
		ListIterator<String> listIt = strList.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next().toUpperCase());
		}
		System.out.println(strList);
		
		// backward after forward
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous().toLowerCase());
		}
		
		System.out.println("--------");
		// directly backward
		ListIterator<String> listItone = strList.listIterator(strList.size());    // we are given a parameter as a cursor position here we are giving size i.e last element

		while(listItone.hasPrevious()) {
			System.out.println(listItone.previous().toLowerCase());
			if(listItone.equals("Dhruv")) {
			listIt.add("Meet");
			}
			if(listItone.equals("Ankit")) {
				listIt.set("Meet");
				}
			
		}
	}

}
