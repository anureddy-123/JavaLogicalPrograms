package LogicalPrograms;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any string");
		String s1 = scn.next();
		String s2 ="";
		for( int i = s1.length()-1; i >= 0; i--  ) {
			s2 = s2+ s1.charAt(i);
		}
		System.out.println("reversed string is.."+" "+s2);
	}

}
