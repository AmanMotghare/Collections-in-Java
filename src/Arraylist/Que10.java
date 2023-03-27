package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Que10 {

	public static void main(String[] args) {
		
		ListArray mylist = new ListArray();
		
		ArrayList<String> list = mylist.MyList();
		
		System.out.println("List Before Shuffling : " +list);
		
		Collections.shuffle(list);
		
		System.out.println("List After Shuffling : " +list);
	}
}
