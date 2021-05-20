package LogicalPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int rev = 0;
		int temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scn.nextInt();
		temp = num;
		 while( num != 0) {
			 int x = num %10;
			 rev = rev * 10 + x ;
			 num = num/10;
		 }
		 if(temp == rev) {
			 System.out.println(rev+" "+ "is a palindrome");
		 }
		 else {
			 System.out.println(rev+" "+"is not a palindrome");
			 
		 }
		
		
	}

}
