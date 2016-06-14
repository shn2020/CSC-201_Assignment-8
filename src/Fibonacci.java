import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			double fibo1 = Fibo(i);
			System.out.print("Fibonaaci #" + (i+1) + " = " + (int)fibo1 + "; ");
			if (i > 1) {
				double fibo2 = Fibo(i-1);
				double quotient = fibo1 / fibo2;
				System.out.print((int)fibo1 + "/" + (int)fibo2 + " = " + quotient); 
			}
			System.out.println();
		}
	}
	
	public static double Fibo(double n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return Fibo(n-1) + Fibo(n-2);
	}
}
