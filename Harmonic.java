import java.util.Scanner;
public class Harmonic {
	public static void main(String[] args) {
	System.out.println("Welcome to Harmonic Number Calculation Programme");
	Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Enter Number of Terms to Add");
        n = scanner.nextInt();
        scanner.close();
		for (int i = 1; i <= n; i++) {
		sum = sum + (1.0/i);
		}
	System.out.println("Sum of "+n+" Harmonic numbers is "+sum);
	}
}
