package Arraylist;

import java.util.ArrayList;

public class Que18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray myArray = new ListArray();
		ArrayList<String> list = myArray.MyList();
		System.out.println("Original Array List : " + list);
		System.out.println("Checking the above ArrayList is Emply or Not : " + list.isEmpty());
		
		list.removeAll(list);
		System.out.println("Array List after removing all Elements: " + list);
		System.out.println("Checking the above ArrayList is Emply or Not : " + list.isEmpty());
	}

}
