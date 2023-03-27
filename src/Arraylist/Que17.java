package Arraylist;

import java.util.ArrayList;

public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray myArray = new ListArray();
		ArrayList<String> list = myArray.MyList();
		System.out.println("Original Array List : " + list);
		
		list.removeAll(list);
		System.out.println("Array List after removing all Elements: " + list);
		
	}

}
