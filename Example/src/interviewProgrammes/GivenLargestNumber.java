package interviewProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenLargestNumber {
	public static void main(String[] args) {
		
		int arr[] = {8,7,0,1,9,1,2,1};
		
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		String resulat = "";
		for(int i=0;i<arr.length;i++) {
			resulat = resulat+arr[i];
		}
		
		System.err.println(resulat);
		
	}
}
