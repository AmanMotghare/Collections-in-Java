package Arraylist;

import java.util.ArrayList;

public class Que22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray myArray = new ListArray();
		ArrayList<String> list = myArray.MyList();
		System.out.println("Original Array List : " + list);
		
		System.out.println("Printing using index of an Element : ");
		for(String color : list){
			System.out.println(color);
		}
	}

}
