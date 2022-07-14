package org.Arraycheck;
import java.util.*; 

public class ArrayCheck {
	public static void main(String args[])
	{
		int a[]={1,2,8,10,5,22,11,6,18,17};
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the number to check is it in the array");
		int b=sc.nextInt();
		boolean found = false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				found = true;
	        break;
			}
		}
		System.out.println(found);
		if(found==true)
			System.out.println("entered value is present in the array");
		else
			System.out.println("entered value is not in the array");
		sc.close();
	}

}
