package programsoncollectios;

import java.util.LinkedList;

public class LinkedlistPrograms {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList<>();
		list.add('a');
		list.add(10);
		list.add(20);
		list.add(10);	
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println("0 "+list.get(0));
		
		/*for(Object obj:list)
		{
			System.out.println(obj);
		}
		if(list.contains("hi"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}*/
	
		System.out.println("1 "+list.get(1));//fetch the first index
		System.out.println("2 "+list.indexOf('a'));//fetch the element of index a
		list.remove(3);//removes the element present in line 3
		System.out.println("3 "+list.set(3, "hello"));//replace the index 3 with hello
		System.out.println("4 "+list.size());//returns the size of list
		System.out.println("5 "+list.getFirst());//fetch the first element
		System.out.println("6 "+list.getLast());//fetch the last element
		list.addFirst("hello");//add the element at first
		list.add("bye");//add the element at last
		list.remove(2);//removes the element present in index 2
		list.removeFirst();//removes the first element
		list.removeLast();//removes the last element
		System.out.println("7 "+list.get(3));
		
		
		
	}

	}


