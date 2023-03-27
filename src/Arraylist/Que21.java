package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Que21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray mylist = new ListArray();
		
		ArrayList list = mylist.MyList();
		
		System.out.println("Original Array : "+ list);
		
		list.set(1, "cyan");
		
		System.out.println("After Replacing : "+ list);
	}

}
