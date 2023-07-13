package dsa_practise;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int c=0;
		System.out.println("enter value: "+a);
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				c++;
				break;
			}else {
				c=0;
			}
			
		}
		if(c>0) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
	}
	

}
