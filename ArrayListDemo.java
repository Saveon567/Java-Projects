package io.github.vikespandey.collections;

import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		List<Integer> arrayList = new  ArrayList<>(5);
	
		for (int i = 1; i <= 5; i++)
			arrayList.add(i);
		
		
		//Printing Elements
		System.out.println(arrayList);
		
		//Remove element at index 3
		arrayList.remove(3);
		
		//Displaying the ArrayList
		//after deletion
		System.out.println(arrayList);
		
		// Printing elements one by one 
		//for (int i = 0; i < arrayList.size(); i++) {
		//	System.out.print(arrayList.get(i) +" ");	
		//		}
		for(int i : arrayList) {
			System.out.print(i+" ");
		}

}
