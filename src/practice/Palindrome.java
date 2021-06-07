package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,temp,sum=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number");
		int num=s1.nextInt();
		temp=num;
		while(num>0) {
        r=num%10;
        sum=(sum*10)+r;
        num=num/10;   
	}
		if(temp==sum) {
			System.out.println(temp+" is palindrome");
		}else {
			System.out.println(temp+" not palindrome");
		}
	}
}
