package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray myList = new ListArray();
		ArrayList list = myList.MyList();
		
		System.out.println("First Arraylist : "+ list);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("Pink");
		
		System.out.println("Second Arraylist : "+ list2);
		
		list.addAll(list2);
		
		System.out.println("New Arraylist : "+ list);
	}

}
