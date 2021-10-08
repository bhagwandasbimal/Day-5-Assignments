import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
	System.out.println("Welcome to Fibonacci Series Calculation Programme");
	int a = 0;
	int b = 1;
	int c = 0;
	int n = 0;
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print(a + " " + b);
        	for (int i = 1; i < n; i++) {
        	c = a + b;
		a = b;
		b = c;
        	System.out.print(" " + c);
        	}
	}
}
