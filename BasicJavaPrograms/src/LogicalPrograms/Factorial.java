
package LogicalPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int   fact = 1;
		int i = 1;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number to find factorial");
		int num = scn.nextInt();
	
		while( i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("factorial of "+" "+num+" "+"is.."+" "+fact);
	}

}
