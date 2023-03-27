package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Que1 {

	public static ArrayList<String> FruitsArraylist() {
		// TODO Auto-generated method stub
		
		ArrayList<String>  arrayList = new ArrayList<String>();
		
		//Adding to the list.
		arrayList.add("Red");
		arrayList.add("Green");
		arrayList.add("Orange");
		arrayList.add("White");
		
		return arrayList;
	}
	
	public static void main(String[] args) {
		
		//FruitsArraylist();
		System.out.println(FruitsArraylist());
		
	}

}
