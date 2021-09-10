package com.xworkz.ControlStatements;

public class DisplayDivisibleBy2and3 {

	public static void main(String[] args) {

		int arr[]= {110,111,112,113,114,115,116,117,118,119,120};
		System.out.println("Beginning of program");
		System.out.println("Numbers divisible by 2 and 3 are :");
		for(int i=0;i<arr.length;i++) 
			if(arr[i]%2==0 && arr[i]%3==0)
			{
				System.out.println(arr[i]);
			}
		System.out.println("Ending of program");
	
	}

}
