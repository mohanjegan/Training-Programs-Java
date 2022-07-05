package org.stringmultiline;
import java.util.*;
public class StrMulLine {
	public static void main(String args[]) {
		String a;
		Scanner c=new Scanner(System.in);
		System.out.println("enter the string");
		a=c.nextLine();
		c.close();
		
		for (int i = 0; i < a.length(); i++) {
		    System.out.println(a.charAt(i));
		}	
	}

}
