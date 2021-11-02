import java.util.Scanner;
public class LargestOfThreeNumbers {
	public static void main(String[] args) {
	System.out.println("Welcome to Number Comparision Programme")
        int a = 0;
	int b = 0;
	int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = scanner.nextInt();
        System.out.println("Enter the Second Number");
        b = scanner.nextInt();
        System.out.println("Enter the Third Number");
        c = scanner.nextInt();
        scanner.close();
        if (a > b && a > c) {
            System.out.println(a+" is greater");
        }
	else if (b > c && b > a) {
            System.out.println(b+" is greater");
	}
	else {
            System.out.println(c+" is greater");
        }

    }
}
