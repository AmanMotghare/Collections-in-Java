package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListArray mylist = new ListArray();
		ArrayList<String> list = mylist.MyList();
		
		System.out.println("List Before Reversing : "+list);
		
		Collections.reverse(list);
		
		System.out.println("List After Reversing : "+list);
		
	}

}
