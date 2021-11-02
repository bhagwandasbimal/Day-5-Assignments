import java.util.Scanner;
public class SwappingNumbers {
	public static void main(String[] args) {
	System.out.println("Welcome to Numbers Swapping Programme");
        int a = 0;
	int b = 0;
	int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        a = scanner.nextInt();
        System.out.println("Please enter the second number");
        b = scanner.nextInt();
	scanner.close();
        System.out.println("First Number entered is " + a);
	System.out.println("Second Number entered is " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("<< NUMBERS AFTER SWAPPING >>");
        System.out.println("First Number entered is " + a);
        System.out.println("Second Number entered is " + b);
	}
}
