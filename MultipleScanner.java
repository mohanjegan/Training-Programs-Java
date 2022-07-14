package org.mulsc;
import java.util.*;
public class MultipleScanner {
	public static void main(String args[]) {
		int a[]=new int[5];
		System.out.println("enter five values for array to calculate its sum");
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int sum=0;//total of array values
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("total of the given array values "+sum);
	}
}
