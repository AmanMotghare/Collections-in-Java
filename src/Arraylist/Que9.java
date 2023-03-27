package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray la = new ListArray();
		
		ArrayList<String> list1 = la.MyList();
		System.out.println("List 1 : "+ list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println("List 2 : "+list2);
		
		Collections.copy(list2, list1);
		
		System.out.println("After Copy : ");
		System.out.println("List 1 : "+ list1);
		
		System.out.println("List 2 : "+list2);
		                                     
	}

}
