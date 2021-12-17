package fact;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number to print multiplication table upto 10 : ");
		int n = sc.nextInt();
		
		for(int i =1; i <=10; i++) {
			int ans = 0;
			ans = n * i;
			System.out.println(n + " * " + i + " = " + ans);
		}
	}
}
