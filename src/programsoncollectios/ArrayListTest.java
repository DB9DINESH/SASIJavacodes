package programsoncollectios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add('a');
		list.add(10);
		list.add(20);
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println("11 "+list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(20);
		list1.add(5);
		list1.add(12);
		list1.add(1);
		list1.add(6);
		System.out.println("10 "+list1);
		java.util.Collections.sort(list1);
		list.addAll(list1);//add all the elements of list1 to 
		for(Integer inte:list1)//fetch all the elements  1 by 1
		{
			System.out.println("9 "+inte);//sort elements in ascending order
		}
	
		for(Object obj:list)
		{
			System.out.println("8 "+obj);
		}
		if(list.contains("hi"))//checks the element presesnt in the list
		{
			System.out.println(7+"yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println("1 "+list.contains("hi"));//check the element present in the list
		System.out.println("2 "+list.get(1));//fetch the first index
		System.out.println("3 "+list.indexOf('a'));//fetch the index of element a
		list.remove(3);//removes the element present in the index 3
		System.out.println("4 "+list.set(3, "hello"));//replace index 3 with hello
		System.out.println("5 "+list.size());//returns the size of arraylist
		Iterator<Object> li=list.iterator();//used to fetch elements
		while(li.hasNext())
		{
			Object data=li.next();
			System.out.println("6 "+data);
		}
		
		
		
		
	
	}
}
