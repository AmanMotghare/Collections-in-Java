package LinkedList;

import java.util.LinkedList;

//Write a Java program to append the specified element to the end of a linked list.


public class MyLinkedList {
	
	public LinkedList mylist(){
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		list.add("Yellow");
		
		return list;
	}
	
	private void Que1(){
		
		LinkedList<String> list = mylist();
		
		System.out.println(list);	
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.Que1();
	}

}
