package LogicalPrograms;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scn.nextInt();
		int  rev = 0;  
		while(num != 0)   
		{  
		int x = num % 10;  
		rev = rev * 10 + x;  
		num = num /10;  
		}  
		System.out.println("The reverse of the given number is "+" "+ rev);  
		}  

}
