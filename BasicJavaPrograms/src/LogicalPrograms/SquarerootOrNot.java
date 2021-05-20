package LogicalPrograms;

import java.util.Scanner;

public class SquarerootOrNot {
	static boolean perfectSquare(int num)
    {
        for (int i = 1; i * i <= num; i++) {
 
            if ((num % i == 0) && (num / i == i)) {
                return true;
            }
        }
        return false;
    }
 
    public static void main(String[] args)
    {
    	
    	Scanner scn = new Scanner(System.in);
    	System.out.println("enter any number");
 
        int num = scn.nextInt();
 
        if (perfectSquare(num)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}


