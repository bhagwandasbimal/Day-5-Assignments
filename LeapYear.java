import java.util.Scanner;
public class LeapYear {
	public static void main(final String[] array) {
        System.out.println("Welcome to Leap Year computation programme");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int nextInt = scanner.nextInt();
        scanner.close();
        if (nextInt >= 1000 && nextInt <= 9999) {
            if ((nextInt % 4 == 0 && nextInt % 100 != 0) || nextInt % 400 == 0) {
                System.out.println("This is a leap year");
            }
            else {
                System.out.println("This is not a leap year");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
	}
}
