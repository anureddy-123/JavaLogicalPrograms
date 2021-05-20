package LogicalPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = scn.nextInt();
		System.out.println("multiplication table of"+" "+num+" "+"is.."+" ");
		for( int i = 1 ; i <= 10 ; i++) {
			System.out.println(num+" "+"*"+" "+i+" "+"="+" "+(num*i));
		}
	}

}
