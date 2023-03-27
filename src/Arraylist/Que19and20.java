package Arraylist;

import java.util.ArrayList;

public class Que19and20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray myArray = new ListArray();
		ArrayList<String> list = myArray.MyList();
		System.out.println("Original Array List : " + list);
		
		list.trimToSize();
		
		System.out.println("Let Trim To Size the above ARRAY : " + list);
		
		list.ensureCapacity(3);
		
		System.out.println("New Array List : " + list);
	}

}
