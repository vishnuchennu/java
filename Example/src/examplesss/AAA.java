package examplesss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.*;

public class AAA {
	
	public static void converter(String inputString){

	    String refinedString = inputString.replaceAll("\\s+","").replaceAll("\\\\n+", "");
	    System.out.println();
	    System.out.println("Refined string: " + refinedString);
	}
	
public static void main(String[] args) {
	
	//int num1 = 20;
	//String e = ;
	//System.err.println(String.format("%03d",num) +" "+String.format("%06d",num1));
//	String s = "!#$#@%#$^$%&%^*&&(*()*()_";
//	CharSequence num = "520";
//	Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
//	Matcher m = p.matcher(num);
//	if (m.find())
//	   System.out.println("There is a special character in my string");
 
	//String s1="java string method by javatpoint";  
	//String[] words=s1.split(" ");
    //System.err.println(Arrays.toString(words));
	
//	 String str = "Next time there won't be a next time after a certain time.";
//     String newString = str.replaceAll("\\s","");
//     System.out.println(newString);
     
//	  String text = "ttrreeww";
//	  List<String> list = Arrays.asList(text.split(""));
//	  Set<String> set = new HashSet<String>();
//	  set.addAll(list);
//	  for(String word : set ) {
//		  System.err.println(word + "  "  +Collections.frequency(list,word));
//	  }

	
//int a[]= {5,5,4,56,7,4,6,7};
//Map<Integer, Integer> map = new HashMap<Integer,Integer>();
//for(int i=0;i<a.length;i++) {
//	map.put(a[i], 0);
//}
//System.err.println(map);
//
//Set<Integer> mk=map.keySet();
//for(Integer mpp:mk) {
//	Integer count=0;
//	 for(int i=0;i<a.length;i++) 
//		 if(mpp==a[i]) {
//			 map.put(mpp,map.get(mpp)+1);
//		 }
//	 }
//System.out.println(map);

	
//int a[] = {1,2,3,1,2,3,3};
//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//for(int i=0;i<a.length;i++) {
//	map.put(a[i], 0);
//}
//System.err.print(map);	
//
//Set<Integer> set = map.keySet();
//System.out.println(set + "keys");
// for(Integer keys : set) {
//	 for(int i=0;i<a.length;i++) {
//		 if(keys==a[i]) {
//			 map.put(keys, map.get(keys)+1);
//		 }
//	 }
// }
//System.err.print(map);	
//
//	String multiLineString = "She is a very good girl"
//            + "Also, she is very intelligent"
//            + "She got the first prize"
//            + "She will definitely make her parents proud";
//
////String singleLineString = multiLineString.replaceAll("\n", " ");
////String singleLineString = multiLineString.replace("[\r\n]+", " "); 
//
//String singleLineString = multiLineString.replaceAll(System.lineSeparator(), " ");
//
//System.out.println(singleLineString);
	

//Duplicate values print only
//String str = "1234525";
//char[] carray = str.toCharArray();
//System.out.println("The string is:" + str);
//System.out.print("Duplicate Characters in above string are: ");
//for (int i = 0; i < str.length(); i++) {
//   for (int j = i + 1; j < str.length(); j++) {
//      if (carray[i] == carray[j]) {
//         System.out.print(carray[j] + " ");
//         break;
//      }
//   }
//}
//	
//String s = "1234525";
//Map<Character, Integer> map = new HashMap<>();
//for(int i=0;i<s.length();i++) {
//	map.put(s.charAt(i), 0);
//}
//System.err.println(map);
//
//Set<Character> set = map.keySet();
//
//for(Character ch:set) {
//	for(int i=0;i<s.length();i++) {
//		if(ch == s.charAt(i)) {
//		map.put(ch, map.get(ch)+1);	
//		}
//	}
//}
//
//System.err.println(map);
	
	
String s = "1234525";
//char ch[] = s.toCharArray();
//for(int i=0;i<s.length();i++) {
//	for(int j=i+1;j<s.length();j++) {
//		if(ch[i]==ch[j]) {
//			System.err.print(ch[j]);
//			break;
//		}
//	}
//}
Map<Character,Integer> map = new HashMap<>();
for(int i=0;i<s.length();i++) {
	map.put(s.charAt(i), 0);
}
Set<Character> set = map.keySet();
for(Character ch :set) {
	for(int i=0;i<s.length();i++) {
		if(ch == s.charAt(i)) {
			map.put(ch, map.get(ch)+1);
		}
	}
		
}
	System.err.println(map);




	
	
	
	
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}	  
}

