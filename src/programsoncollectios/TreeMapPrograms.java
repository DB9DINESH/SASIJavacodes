package programsoncollectios;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapPrograms {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(107, "nike");
		map.put(104, "puma");
		map.put(102, "addidas");
        map.put(103, "reebok");
        map.put(100, "wildcraft");
        //map.put(null,"hi");//not allowed
        map.put(101, null);
        map.put(107, "hello");
        map.put(108, "nike");
        for(Entry<Integer, String> data:map.entrySet())//usage of for-each loop
        {
        	System.out.println(data.getValue()+","+data.getKey());
        }
        

	}

}
