package DataStructures;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.HashMap;
// java.util.Set;

public class HashmapUse {
	
	public static void main(String[] args) {
		
//		Hashmap<String, Integer> map = new Hashmap<>();
//		for(int i=0;i<30;i++) {
//			map.insert("abc"+i, i);
//			System.out.println(map.getValue("abc"+i)+ " load factor:"+ map.loadFactor());
//		}
		HashMap<Integer,String> m = new HashMap<>();
		for(int i=0;i<10;i++) {
			m.put(i,""+(char)(97+i));
		}
		for(int object:m.keySet()) {
			String a = m.get(object);
			System.out.println(a);
		}
		
		
	}
}
		