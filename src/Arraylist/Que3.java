package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Que3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListArray Mylist = new ListArray();
		
		ArrayList list = Mylist.MyList();
		
		System.out.println("Before Adding Element : ");
		System.out.println(list);
		
		System.out.println("\n\nAfter Adding Element : ");
		
		list.add(0, "PINK");
		
		System.out.println(list);
	}

}
