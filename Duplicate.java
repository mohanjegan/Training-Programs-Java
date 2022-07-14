package org.duplicate;

public class Duplicate {
	public static void main(String args[])
	{
		int a[]={10,20,20,30,30,30,10};
		System.out.println(a[0]);
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1])
				continue;
			System.out.println(a[i]);
		}
	}
}
