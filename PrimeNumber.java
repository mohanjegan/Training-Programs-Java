package org.prime;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]) {
		System.out.println("enter the number to check for PrimeNumber");
		Scanner sc= new Scanner(System.in);
				int a=sc.nextInt();
				sc.close();
				int i,b=a/2,c=0;
				if(a==0||a==1)
					System.out.println(a+" is not PrimeNumber");
				else {
					for(i=2;i<=b;i++) {
						if(a%i==0) {
							System.out.println(a+" is not a PrimeNumber");
							c=1;
							break;
						}			
				}
					if(c==0)
					System.out.println(a+" is a PrimeNumber");
						
	}
				
}
}
