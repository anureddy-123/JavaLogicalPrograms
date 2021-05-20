package LogicalPrograms;

import java.util.Scanner;

public class BiggestElement {
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
	int max = arr[0];
	
	for( int i = 0 ; i< arr.length ; i++) {
		if ( max < arr[i] ) {
			max = arr[i];
		}
	}
	System.out.println("biggest element in a given array is"+" "+max);

}
}
