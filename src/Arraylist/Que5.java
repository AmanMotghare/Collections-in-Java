package Arraylist;

import java.util.ArrayList;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray Mylist = new ListArray();
		
		ArrayList list = Mylist.MyList();
		
		System.out.println("Old List : " + list);
		
		list.set(2,"YELLOW");
		
		System.out.println("New List : " + list);
		
	}

}
