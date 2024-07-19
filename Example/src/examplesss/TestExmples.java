package examplesss;

import java.util.*;

public class TestExmples {
public static void main(String[] args) {

	 
	//1. WAP to input two numbers and find sum >>>>>
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter numbers A");
//	 int a = sc.nextInt();
//	 System.out.println("enter numbers B");
//	 int b = sc.nextInt();
//     int sum =a+b;
//     System.out.println("Total two number sum  "  +sum);
     //WAP to input two numbers and find sum <<<<<
     
     //2.WAP to input two numbers and find multiplication >>>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter numbers A");
//	 int a = sc.nextInt();
//	 System.out.println("enter numbers B");
//	 int b = sc.nextInt();
//	 int multiplication =a*b;
//     System.out.println("Total two number multiplication  "  +multiplication);
   //WAP to input two numbers and find multiplication <<<<<
  
	//3.WAP to input number and calculate its square and cube.>>>>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter number ");
//	 int a = sc.nextInt();
//	 int square  =a*a;
//	 int cube = a*a*a;
//     System.out.println(square + " square ");
//     System.out.println(cube + " cube");
   //WAP to input number and calculate its square and cube.<<<<<
	
	//4.WAP to input length and breadth of a rectangle and calculate its area. Area=Length*Breadth >>>>>>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter length ");
//	 int length = sc.nextInt();
//	 System.out.println("enter breadth ");
//	 int breadth = sc.nextInt();
//	 int area =length*breadth;
//     System.out.println("Total Area  "  +area);
   //WAP to input length and breadth of a rectangle and calculate its area. Area=Length*Breadth <<<<<<<<<<
	
	
	//5.WAP to input radius and calculate area of circle and circumference of a circle. Area of circle = 3.14*r*r, Circumference of circle = 2*3.14*r >>>>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter radius ");
//	 double radius = sc.nextDouble();
//	 double Areaofcircle  =3.14*radius*radius;
//	 double Circumferenceofcircle  = 2*3.14*radius;
//    System.out.println("Area of circle "  +Areaofcircle);
//    System.out.println("Circumference of circle " +  Circumferenceofcircle);
  //5.WAP to input radius and calculate area of circle and circumference of a circle. Area of circle = 3.14*r*r, Circumference of circle = 2*3.14*r <<<<<<
	 
	//6.WAP to input radius and height of a cylinder and calculate volume of cylinder. Volume=3.14*r*r*h >>>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter radius of a Cylinder");
//	 double radius = sc.nextDouble();
//	 System.out.println("enter height of a Cylinder");
//	 double height = sc.nextDouble();
//     double volume=3.14*radius*radius*height;
//     System.out.println("calculate Volume of Cylinder  "  +volume);
	//WAP to input radius and height of a cylinder and calculate volume of cylinder. Volume=3.14*r*r*h <<<<<<
	
	//7.WAP to input principal, rate, time and calculate Simple Interest. Simple Interest=Principal*Rate*Time/100 >>>
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("enter principal amount ");
//	 double principal = sc.nextDouble();
//	 System.out.println("enter Rate amount ");
//	 double rate = sc.nextDouble();
//	 System.out.println("enter Time amount ");
//	 double time = sc.nextDouble();
//	 double interest = principal*rate*time/100;
//	 System.out.println("calculate Simple Interes  "  +interest);
	//.WAP to input principal, rate, time and calculate Simple Interest. Simple Interest=Principal*Rate*Time/100 <<<<
	 
	//8.WAP to Input 5 subject marks of a student and find total marks and percentage obtained by the student.
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Spring Markes ");
//	double spring = sc.nextDouble();
//	System.out.println("Enter SpringBoot Markes ");
//	double sb = sc.nextDouble();
//	System.out.println("Enter C++ Markes ");
//	double c = sc.nextDouble();
//	System.out.println("Enter java Markes ");
//	double java = sc.nextDouble();
//	System.out.println("Enter Angular Markes ");
//	double angular = sc.nextDouble();
//	
//	double total = spring+sb+c+java+angular;
//	System.out.println("Toatl Markes of 5-subjects "  +total);
//	
//	//System.out.println("Enter percentage  ");
//	//double percentage  = sc.nextDouble();
//	
//	double percentageamount  = total/5.0;
//	System.out.println("Toatl 5 subject percentage "  +percentageamount);
	//WAP to Input 5 subject marks of a student and find total marks and percentage obtained by the student.
	
String s = "1211";
//char ch[] = s.toCharArray();
//for(int i=0;i<ch.length;i++) {
//	for(int j=i+1;j<ch.length;j++) {
//		if(ch[i] == ch[j]) {
//			System.err.print(ch[j]);
//		break;
//		}
//	
//	}
//}

//for(int i=0;i<s.length();i++) {
//	for(int j =i+1;j<s.length();j++) {
//		if(s.charAt(i) == s.charAt(j)) {
//			System.err.print(s.charAt(j));
//			break;
//		}
//	}

//List<String> list = Arrays.asList(s.split(""));
//Set<String> set = new HashSet<>();
//set.addAll(list);
//
//for(String word:set) {
//	System.err.println(word + " --> " +Collections.frequency(list, word));
//
//}

Map<Character, Integer> map = new HashMap<>();
for(int i=0;i<s.length();i++) {
	map.put(s.charAt(i), 0);
}

Set<Character> set = map.keySet();

for(Character ch : set) {
	for(int i=0;i<s.length();i++){
		if(s.charAt(i) == ch) {
			map.put(ch, map.get(ch)+1);
		}
	}
}

System.err.println(map);


	
}
}
