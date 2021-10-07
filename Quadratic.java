import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
        int a;
	int b;
	int c;
	int d;
        double Root1;
	double Root2;
        System.out.println("Welcome to Quadratic Roots calculation programme");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = scan.nextInt();
        System.out.println("Enter the value of b");
        b = scan.nextInt();
        System.out.println("Enter the value of c");
        c = scan.nextInt();
        System.out.println("The roots of the equation " + a + "x^2+" + b + "x+" + c + " are ");
        scan.close();
        d = b * b - 4 * a * c;
        	if (d >= 0) {
        		Root1 = (float) (-b + Math.sqrt(d)) / (2 * a);
        		Root2 = (float) (-b - Math.sqrt(d)) / (2 * a);
        		System.out.println("Root 1: " + Root1 + "  &  Root 2: " + Root2);
        	}
		else {
        	System.out.println("No real solution, Roots are imaginary");
        	}
	}
}
