package LogicalPrograms;

import java.util.Scanner;

public class TwinPrimes {
	public static void main(String[] args) {

        int i = 0;

        int  k = 0, l = 0;

        int num = 0;

        System.out.println("Round" + " " + ++i + ":");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the search range:");
       int  j = scn.nextInt();
        {
            if (j < 0)
                System.out.println("End");
        }

        for (i = 3; i <= j; i++) {

            int counter = 0;
            for (num = k ; num >= 1; num--) {

                {
                    if (k % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {

                }
            }
            System.out.println("(" + i + "," + i + ")" + " " + "(" + i + "," + i + ")");

            // sum Number of twin primes to
            System.out.println("Number of twin primes less than or equal to " + j + " " + "is" + " ");
            return;
        }
    }

}
