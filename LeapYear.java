import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Welcome to Leap Year computation programme");
		int year;
        	Scanner x = new Scanner(System.in);
        	System.out.println("Please enter the Year");
        	year = x.nextInt();
        	x.close();

        	if (year >= 1000 && year <= 9999) {
        		if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
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
