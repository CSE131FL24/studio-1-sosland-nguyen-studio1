package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) { 
		System.out.println("The first of two integers to be averaged?");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int n2 = in.nextInt();
		double average = (n2+n1)/2;
		System.out.println(average);

		// TODO Auto-generated method stub

	}

}
