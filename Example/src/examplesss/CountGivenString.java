package examplesss;

import java.util.*;

public class CountGivenString {
	public static void main(String[] args) {
		// Arrays in number count
//		int a[] = { 1, 2, 1, 2, 1, 2, 3 };
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < a.length; i++) {
//			map.put(a[i], 0);
//		}
//
//		Set<Integer> keySets = map.keySet();
//		for (Integer keys : keySets) {
//			for (int i = 0; i < a.length; i++) {
//				if (keys == a[i]) {
//					map.put(keys, map.get(keys) + 1);
//				}
//			}
//		}
//		System.err.println(map);

		// Arrays in String count
//		String a[] = { "A", "B", "C", "A", "B", "C" };
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for (int i = 0; i < a.length; i++) {
//			map.put(a[i], 0);
//		}
//		System.err.println(map);
//		Set<String> setKeys = map.keySet();
//		for (String keys : setKeys) {
//			for (int i = 0; i < a.length; i++) {
//				if (keys == a[i]) {
//					map.put(keys, map.get(keys) + 1);
//				}
//			}
//		}
//		System.err.println(map);

//	String text = "aabbccddd";	
//	List<String> list = Arrays.asList(text.split(""));
//	Set<String> set = new HashSet<String>(list);	
//	for(String keys:set) {
//		Object k = Collections.frequency(list, keys);
//		System.err.println(keys+ " Keys "  +k+  " values ");
//		
//	}
//		
//		int numofdays = 1000;
//		int oneyear = 365;
//		int months = 30;
//		int week = 7;
//		
//		int y = numofdays / oneyear;
//		//System.err.println(y + " years");
//		
//		int remaingdays = numofdays - y * oneyear;
//		//System.err.println(remaingdays + " remaingdays");
//		
//		int month = remaingdays / months;
//		//System.err.println(month + " month" );
//
//		int remmain =  remaingdays % months;
//		//System.err.println(remmain + " remaingdays");
//		
//		int weeks = remmain/week;
//		
//		int days = remmain%week;
//		
//		System.err.println(y + " Year " +month + " Month " +weeks + " weeks " +days+ "  days ");
		
      
		
	int a[] = {1,1,2,2,3,1,2,3,5};
	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	
	for(int i=0;i<a.length;i++) {
		map.put(a[i], 0);
	}
	System.err.println(map + "first put the array values in map");
    Set<Integer> setKeys = map.keySet();
    for(Integer setint:setKeys) {
    	for(int i=0;i<a.length;i++) {
    		if(setint == a[i]) {
    			map.put(setint, map.get(setint)+1);
    		}
    	}
    }
    System.err.println(map);	
		

	}
}
