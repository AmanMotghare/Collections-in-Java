package Arraylist;

import java.util.ArrayList;

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray mylist = new ListArray();
		ArrayList<String> list = mylist.MyList();
		
		System.out.println("Original List :" + list);
		
		System.out.println("List of first three elements : "+list.subList(0, 3));
	
	}

}
