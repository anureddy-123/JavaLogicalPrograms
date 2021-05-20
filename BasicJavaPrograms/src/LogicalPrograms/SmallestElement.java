package LogicalPrograms;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println("enter"+" "+size+" "+"elements");
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i]=scn.nextInt();
		}
		for( int i = 0 ; i <  arr.length ; i++) {
			System.out.println(arr[i]);
		}
		int min = arr[0];
		
		for( int i = 0 ; i< arr.length ; i++) {
			if ( min > arr[i] ) {
				min = arr[i];
			}
		}
		System.out.println("smallest element in a given array is"+" "+min);

	}

}
