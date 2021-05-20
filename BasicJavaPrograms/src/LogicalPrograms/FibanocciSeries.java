package LogicalPrograms;

import java.util.Scanner;

public class FibanocciSeries {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scn.nextInt();

	    int firstele = 0, secondele = 1;

	    for (int i = 1; i <= num; i++) {
	    	
	      System.out.print(firstele + ", ");
	      
	      int nextele = firstele + secondele;
	      firstele = secondele;
	      secondele = nextele;
	    }
	    System.out.println("Fibonacci Series of " + num + " terms are");

	  }

}
