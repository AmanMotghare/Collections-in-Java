package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray myList = new ListArray();
		ArrayList list = myList.MyList();
		
		System.out.println("ArrayList Before Swap : "+ list);
		
		Collections.swap(list, 1, 2);
		
		System.out.println("ArrayList After Swap : "+ list);
		
	}

}
