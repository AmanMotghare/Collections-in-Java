package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListArray Mylist =  new ListArray();
		Scanner scan =  new Scanner(System.in);
		
		ArrayList list = Mylist.MyList();
	
		System.out.print("Enter element you want to find : ");
		
		String a = scan.nextLine();
		
		if(list.contains(a)){
			System.out.println("Found the Element.");
		}
		else{
			System.out.println("Element not Found.");
		}
		
	}

}
