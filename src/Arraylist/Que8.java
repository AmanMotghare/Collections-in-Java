package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray myList = new ListArray();
		
		ArrayList<String> list = myList.MyList();
		
		System.out.println("Unsorted List : "+list);
		
		Collections.sort(list);
		System.out.println("Sorted List :");
		for(String color : list){
			System.out.println(color);
		}
		
	}

}
