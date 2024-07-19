package examplesss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VishnuClass {
public static void main(String[] args) {
String s = "aabbcccccdd";
//Map<Character, Integer> map  = new HashMap<>();
//for(int i=0;i<s.length();i++) {
//	map.put(s.charAt(i), 0);
//}
//System.out.println(map);
//
//Set<Character> set = map.keySet();
//System.out.println(set);
//
//for(Character ch :set) {
//	for(int i=0;i<s.length();i++) {
//		if(ch == s.charAt(i)) {
//			map.put(ch, map.get(ch)+1);
//		}
//	}
//}
//System.out.println(map);

//List<String> list = Arrays.asList(s.split(""));
//Set<String> set = new HashSet<>(list);
//System.out.println(set);
//for(String word :set) {
//	System.err.println(word+ "  "  + Collections.frequency(list, word));
//}
//
//int[] nums = {5,1,2,11,3};
//Arrays.sort(nums);
//String[] a=Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");  
//StringBuilder sb= new StringBuilder();
//String filter = "";
//for(int i=0;i<a.length;i++){  
// sb.append( "'"+a[i]+"'," );
//}
//
//filter = sb.toString();
//filter = filter.substring(0, filter.length()-1);
//
//
//System.out.println(filter);

//Map<Character, Integer> map = new HashMap<>();
//for(int i=0;i<s.length();i++) {
//map.put(s.charAt(i), 0);	
//}
//
//Set<Character> set = map.keySet();
//
//System.err.println(set);
//
//
//for(Character ch:set) {
//	for(int i =0;i<s.length();i++) {
//		if(ch == s.charAt(i)) {
//			map.put(ch, map.get(ch)+1);
//		}
//	}
//}
//
//System.err.println(map);

//
//List<String> list = Arrays.asList(s.split(""));
//Set<String> set = new HashSet<>();
//set.addAll(list);
//
//for(String s1:set) {
//	System.err.println(s1 +" "+Collections.frequency(list, s1) );
//}


//int a[] = {1,2,3,3,4,3};
//
//Map<Integer, String> map = new HashMap<>();
//
//for(int i=0;i<a.length;i++) {
//	map.put(a[i], "");
//}
//
//Set<Integer> set = map.keySet();
//
//for(Integer in:set) {
//	for(int i=0;i<a.length;i++) {
//		if(in == a[i]) {
//			map.put(in, map.get(in)+1);
//		}
//	}
//}
//
//System.err.println(map);


String a ="1122";
//Map<Character, Integer> map = new HashMap<>();
//for(int i=0;i<a.length();i++) {
//	map.put(a.charAt(i), 0);
//}
//
//Set<Character> set = map.keySet();
//
//for(Character ch :set) {
//	for(int i=0;i<a.length();i++) {
//		if(ch == a.charAt(i)) {
//			map.put(ch, map.get(ch)+1);
//		}
//	}
//}
//
//System.err.println(map);

//List<String> list = Arrays.asList(a.split(""));
//
//Set<String> set = new HashSet<>();
//
//set.addAll(list);
//
//for(String s1:set) {
//	System.err.println(s1+ " "  + Collections.frequency(list, s1));
//}

String aa = "aaabb";
char[] ch = aa.toCharArray();

for(int i=0;i<ch.length;i++) {
	for(int j=i+1;j<ch.length;i++) {
		if(ch[i] == ch[j]) {
			System.err.print(ch[i]);
			break;
		}
	}
}

}
}
