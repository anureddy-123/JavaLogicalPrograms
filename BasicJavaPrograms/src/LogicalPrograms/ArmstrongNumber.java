package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int arm = 0,temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scn.nextInt();
		temp = num;
		
		while(num != 0) {
			int x = num % 10;
			arm = arm + x * x * x;
			num = num/10;
		}
		if ( temp == arm) {
			System.out.println(temp +" "+"it is a armstrong number");
		}
		else {
			System.out.println(temp+" "+ " it is not a armstrong number");
		}
	
	}

}
