import java.util.Scanner;
public class Harmonic {
	public static void main(String[] array) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        System.out.println("Please Enter the number of terms to add");
        int nextInt = scanner.nextInt();
        scanner.close();
        	for (int i = 1; i <= nextInt; ++i) {
        		x += (1 / i);
        		System.out.println(x);
        	}
        System.out.println("The sum of "+nextInt+" Harmonic numbers is "+x);
	}
}
