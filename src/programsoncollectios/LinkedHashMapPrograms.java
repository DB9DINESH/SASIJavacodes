package programsoncollectios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapPrograms {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Object> map=new LinkedHashMap<>();
		map.put(10,"hi");
		map.put(null,20);//allowed
		map.put(null,100);//multiple null keys is not allowed
		map.put(20, null);//allowed
		map.put(60, null);//multiple null values are allowed
		map.put(30, "hello");
		map.put(50, "hello");//duplicates values are allowed
		map.put(10, 'A');//duplicate keys are not allowed
		System.out.println(map);
		System.out.println(map.get(50));//value of key
		System.out.println(map.containsKey(30));
		System.out.println(map.containsValue("hello"));
	    System.out.println(map.putIfAbsent(40, "hello"));
	    System.out.println(map.remove(30,"hello"));
	    System.out.println(map.replace(50,"bye"));
	    System.out.println(map.size());
	    
	    for(Entry<Integer, Object> data:map.entrySet())//usage of for-each loop
	    {
	    	System.out.println(data.getKey()+","+data.getValue());
	    }
		}

	}


