package com.xworkz.ControlStatements;

public class DisplayEvenIndex {

	public static void main(String[] args) {
		int arr[]= {110,111,112,113,114,115,116,117,118,119,120};
		for(int i=0;i<arr.length;i++) 
			if(i%2==0)
			{
				System.out.println(i);
			}
	}

}
