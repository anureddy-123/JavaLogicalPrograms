package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scn.nextInt();
		int i, m = 0, flag = 0;
	      m = num / 2;
	      if (num == 0 || num == 1) {
	         System.out.println(num + " "+" it is not a prime number");
	      } else {
	         for (i = 2; i <= m; i++) {
	            if (num % i == 0) {
	               System.out.println(num +" " +"it is not a prime number");
	               flag = 1;
	               break;
	            }
	         }
	         if (flag == 0) {
	            System.out.println(num + " "+" it is a prime number");
	         }
	      }
	   }
	}


