package Arraylist;

import java.util.ArrayList;

public class Que13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray mylist = new ListArray();
		ArrayList <String> list1 = mylist.MyList();
		
		System.out.println("List 1 "+ list1);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("Pink");
		
		System.out.println("List 2 "+ list2);
		
		ArrayList list3 =new ArrayList();
		
		for(String a : list1){
			
			if(list2.contains(a)){
				list3.add("yes");
			}
			else{
				list3.add("no");
			}
		}
		
		System.out.println("Output : "+list3);
	}

}
