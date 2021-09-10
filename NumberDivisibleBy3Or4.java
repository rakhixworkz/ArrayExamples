package com.xworkz.ControlStatements;

public class NumberDivisibleBy3Or4 {

	public static void main(String[] args) {
		int arr[]= {110,111,112,113,114,115,116,117,118,119,120};
		System.out.println("Beginning of program");
		System.out.println("Numbers divisible by 3 or 4 are :");
		for(int i=0;i<arr.length;i++) 
			if(arr[i]%3==0 || arr[i]%4==0)
			{
				System.out.println(arr[i]);
			}
		System.out.println("Ending of program");
	}

}
