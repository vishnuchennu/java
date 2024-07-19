package examplesss;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.err.println("enter number..");
    int number = sc.nextInt();
    boolean isPrime = true;
    for(int i=2;i<number/2;i++) {
    	if(number%i == 0) {
    		isPrime = false;
    		break;
    	}
    }
     
    if(isPrime) {
    	System.err.println("is Prime");
    }else {
    	System.err.println("Not is Prime");
    }
    
	}
}
