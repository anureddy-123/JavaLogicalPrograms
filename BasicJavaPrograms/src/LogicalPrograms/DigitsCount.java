package LogicalPrograms;

import java.util.Scanner;

public class DigitsCount {
	public static void main(String[] args) {
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scn.nextInt();	
	while(num > 0) {
		num = num / 10;
		count = count + 1; 
	}
	System.out.format("Number of Digits in a Given Number is.."+" "+ count);
}

}
