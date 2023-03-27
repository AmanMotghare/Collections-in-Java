package Arraylist;

import java.util.ArrayList;

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray myArray = new ListArray();
		
		ArrayList list = myArray.MyList();
		
		System.out.println("Original Array List : "+ list);
		
		ArrayList list2 =(ArrayList) list.clone();
		
		System.out.println("New Array List : "+ list2);
		
		
	}

}
