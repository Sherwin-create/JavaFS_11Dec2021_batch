package fact;

import java.util.Scanner;

public class NPRandNCR {
	public static void main(String args[]) {
		int n, r;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n value : ");
		n = sc.nextInt();
	
		System.out.print("Enter 'r' value : ");
		r = sc.nextInt();
		sc.close();
		
		System.out.println("nCr = " + nCr(n,r));
		System.out.println("nPr = " + nPr(n,r));
	}
	
	public static int nCr(int n, int r) {
		int h = n - r;
		int nCr = (FactorialOfANumber.calculateFactorial(n))/
				((FactorialOfANumber.calculateFactorial(r)) * (FactorialOfANumber.calculateFactorial(h)));
		
		return nCr;
	}
	
	public static int nPr(int n, int r) {
		int result = ((FactorialOfANumber.calculateFactorial(n))/(FactorialOfANumber.calculateFactorial(n-r)));
		return result;
	}
}
