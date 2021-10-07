import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
        int x;
	System.out.println("Welcome to Even or Odd number checking programme");
        System.out.println("Please enter an integer");
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
	num.close();
        	if ((x % 2) == 0) {
        		System.out.println("Entered number is Even.");
        	}
		else {
        		System.out.println("Entered number is Odd");
        	}
	}
}
