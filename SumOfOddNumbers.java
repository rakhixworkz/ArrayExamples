package com.xworkz.ControlStatements;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int arr[]= {110,111,112,113,114,115,116,117,118,119,120};
		int sum=0;
		System.out.println("Beginning of program");
		System.out.print("sum of odd numbers are :");
		for(int i=0;i<arr.length;i++) 
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		System.out.println(sum);
		System.out.println("Ending of program");
	}

}
