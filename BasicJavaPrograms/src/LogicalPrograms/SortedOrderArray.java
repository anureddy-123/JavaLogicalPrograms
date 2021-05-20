package LogicalPrograms;

import java.util.Scanner;

public class SortedOrderArray {
	public static void main(String[] args) {  
		int temp;
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
            
      
        for (int i = 0; i < arr.length; i++) {     
        	
            for (int j = i+1; j < arr.length; j++) { 
            	
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
        System.out.println("Elements of array sorted in sorting order");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    


