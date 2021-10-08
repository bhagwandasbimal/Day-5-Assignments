import java.util.Scanner;
public class PrimeNumber {
	public static void main(String [] args) {
	System.out.println("Welcome to Prime Number Determination Programme");
	System.out.println("Please enter a number");
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	scan.close();
	int count = 0;
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
			count++;
			}
		}
		if (count == 1) {
		System.out.println(x+" is a Prime Number");
		}
		else {
		System.out.println(x+" is not a Prime Number");
		}
	}
}
