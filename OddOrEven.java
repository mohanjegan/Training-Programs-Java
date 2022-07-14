package org.oddeven;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner a= new Scanner(System.in);
		int b=a.nextInt();
		if(b%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		a.close();
	}

}
