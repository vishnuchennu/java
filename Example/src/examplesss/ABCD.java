package examplesss;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ABCD {
	public static void main(String[] args) {

//		Calendar now = Calendar.getInstance();
//		now.set(Calendar.MINUTE, 0);
//		now.set(Calendar.HOUR_OF_DAY, 0);
//		now.set(Calendar.SECOND, 0);
//		now.set(Calendar.MILLISECOND, 0);
//
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date date = null;
//		try {
//			date = sdf1.parse("2023-07-20");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//
//		System.out.println(date.after(now.getTime()));
		
	String s = "123654123";
//	char ch[] = s.toCharArray();
//	System.err.print("Duplicate values :");
//	for(int i=0;i<s.length();i++) {
//		for(int j=i+1;j<s.length();j++) {
//			if(ch[i] == ch[j]) {
//				System.err.print(ch[j]);
//			}
//		}
//	}
	
	Map<Character,Integer> map = new HashMap<>();
	for(int i=0;i<s.length();i++) {
		map.put(s.charAt(i),0);
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
