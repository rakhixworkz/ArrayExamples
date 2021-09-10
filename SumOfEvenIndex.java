package com.xworkz.ControlStatements;

public class SumOfEvenIndex {

	public static void main(String[] args) {
		int arr[]= {110,111,112,113,114,115,116,117,118,119,120};
		int sum=0;
		System.out.println("Beginning of program");
		System.out.print("sum of even index are :");
		for(int i=0;i<arr.length;i++) 
			if(i%2==0)
			{
				sum=sum+i;
			}
		System.out.println(sum);
		System.out.println("Ending of program");
	}

}
