package programsoncollectios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetProgams {

	public static void main(String[] args) {
		LinkedHashSet<Object> set =new LinkedHashSet<>();
		set.add("Hi");
		set.add('A');
		set.add(10);
		set.add(40);
		set.add(10);
		set.add(null);
		set.add(null);
		set.add(10);
		set.add(20);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(40));
		System.out.println(set.isEmpty());
		System.out.println(set.remove('A'));
		
		
		ArrayList<Object> list=new ArrayList<>(set);//binding elements of set into list
		list.get(2);
		list.indexOf(null);
		
		Iterator<Object> it= list.iterator();
		while(it.hasNext())
		{
			System.out.println("2  "+it.next());
		}
		
		
		

	}
	}


