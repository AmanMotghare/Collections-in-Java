package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray Mylist = new ListArray();
		
		ArrayList list = Mylist.MyList();
		
//		System.out.println(Mylist.MyList());
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next()+" ");
		}
		
		
		
	}
}
