package examplesss;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
    
    	Scanner ina = new Scanner(System.in);
		int testCases = Integer.parseInt(ina.nextLine());
		while(testCases>0){
			String pattern = ina.nextLine();
		     boolean a =  pattern.matches(pattern);
		     if(a) {
		    	System.err.print("valid"); 
		     }else{
		    	 System.err.print("Invaild");  
		     }
		}
}

}