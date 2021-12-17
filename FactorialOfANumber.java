package fact;

public class FactorialOfANumber {
		public static void main(String args[]) {
		 int facto = calculateFactorial(5);
		 System.out.println(facto);
		}
		
		public static int calculateFactorial(int n){
			int f = 1 ;
			
			for(int i = 1; i <= n; i++) {
				f = f * i;
			}
			return f;
		}

}


