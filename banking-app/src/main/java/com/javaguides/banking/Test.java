package com.javaguides.banking;

import java.util.*;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        gamesList.forEach((data)->System.err.println( data));
        
		

	}

}
