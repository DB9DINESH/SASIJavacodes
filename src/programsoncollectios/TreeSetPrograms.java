package programsoncollectios;

import java.util.TreeSet;

public class TreeSetPrograms {

	public static void main(String[] args) {
		TreeSet<Object> set=new TreeSet<>();
		set.add(6);
		set.add(4);
		set.add(0);
		set.add(2);
		set.add(1);
		System.out.println("1  "+set);//print values in ascending order
		System.out.println("2  "+set.descendingSet());//print values in descending order
		
		if(set.contains(0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.isEmpty());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		
		TreeSet<Character> set1=new TreeSet<>();
		set1.add('b');
		set1.add('a');
		set1.add('c');
		System.out.println(set1);
	    System.out.println(set1.descendingSet());//print values in descending order
		
		if(set1.contains('a'))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(set1.first());
		System.out.println(set1.last());
		System.out.println(set1.isEmpty());
		System.out.println(set1.pollFirst());
		System.out.println(set1.pollLast());
		System.out.println("3  "+set1);
		

	}

}
