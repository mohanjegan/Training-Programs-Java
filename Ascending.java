package org.asc;

public class Ascending {
	public static void main(String args[])
	{
		int a[]={8,10,6,22,80,70,56,21,17,18};
		int temp=0;
		 System.out.println("Elements of original array: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }   
	        for (int i = 0; i < a.length; i++) {     
	            for (int j = i+1; j < a.length; j++) {     
	               if(a[i] > a[j])// using < sign can do the descending order array
	               {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	               }     
	            }     
	        }    
	        System.out.println(); 
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
			
	        }
	}
}


