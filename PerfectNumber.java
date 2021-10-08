import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
	System.out.println("Welcome to Perfect Number Determination Programme");
        int x = 0;
	int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        x = sc.nextInt();
	sc.close();
        	for (int i = 1; i < x; i++) {
            		if (x % i == 0) {
                		y = y + i;
        		}
        	}
        	if (x == y) {
        	System.out.println(x+" is a perfect number");
        	}
		else {
        	System.out.println(x+" is not perfect number");
        	}
	}
}
