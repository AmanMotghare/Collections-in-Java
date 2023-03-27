package Arraylist;

import java.util.ArrayList;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray Mylist = new ListArray();
		
		ArrayList list = Mylist.MyList();
		
		System.out.println("Old List : " + list );
		
		list.remove(2);
		
		System.out.println("After removing third element from the list : \n"+list);

		
	}

}
