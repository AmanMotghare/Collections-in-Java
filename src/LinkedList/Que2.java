package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Que2 {

	// Write a Java program to iterate through all elements in a linked list.
	
	public static void main(String[] args) {
		
		MyLinkedList mylist = new MyLinkedList();
		
		LinkedList<String> list= mylist.mylist();
		
		Iterator<String> itr = list.listIterator(2);
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
	}
	
}
