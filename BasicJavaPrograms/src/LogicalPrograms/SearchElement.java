package LogicalPrograms;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int flag = 0;
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
	 
	 
	 System.out.println("Enter the element to be seached");
	int  search = scn.nextInt();
	    
	     for(int i = 0;i< arr.length ;i++) {
	         if(arr[i] == search)  {
	             System.out.println("Element "+search+" found at "+i+" position");
	             flag = 1;
	             break;
	         }
	     }
	     if(flag == 0) {
	         System.out.println("Element "+search+" is not found in a given array");
	     }
	 }

  }
