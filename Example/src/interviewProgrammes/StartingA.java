package interviewProgrammes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*write program to find name in list which stared with "A" character using with java 8 feature*/

public class StartingA {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("anaban");
	list.add("beaa");
	list.add("AAaba");
	list.add("aasssaa");
	list.stream().filter((data)-> data.startsWith("a") || data.startsWith("A")).forEach(System.out::println);
	
	
	
	
}
}
