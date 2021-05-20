package LogicalPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println(145 % 1);
    	System.out.println(145 / 1);
		
		int lastdig;
		int fact= 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  " );
		int num = sc.nextInt();
		int total = 0;
		int temp = num;
		while(num != 0)
		{
		
		lastdig = num % 10;
		while(i <= lastdig)
		{
		fact = fact * i;
		i++;
		}
		total = total + fact;
		num = num / 10;
		}
		if(total == temp) {
		System.out.println(temp + " is a strong number");
		}
		else {
		System.out.println(temp + " is not a strong number");
		}
		System.out.println();
		}
	}
