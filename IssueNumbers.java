package com.xworkz.ControlStatements;

public class IssueNumbers {

	public static void main(String[] args) {
		int issueBlocks[]= {110,111,112,113,114,115};
		System.out.println("Beginning of program");
		for(int i=0;i<issueBlocks.length;i++)
		{
			System.out.println("size of issueBlocks :" +issueBlocks.length);
			System.out.println("Index value :" +i);
			System.out.println("Actual value :" +issueBlocks[i]);
			System.out.println("Ending of program");
		}
	}

}
