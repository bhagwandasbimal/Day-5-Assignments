import java.util.Scanner;
public class Euclidean {
	public static void main(String[] args) {
        int x;
	int y;
        Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to Euclidean Distance Calculation Programme");
        System.out.println("Enter the value of X and Y");
        System.out.println("Enter X:");
        x=scanner.nextInt();
        System.out.println("Enter Y:");
        y=scanner.nextInt();
        double distance=  Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean distance from the point (X,Y) to the origin (0,0) is : " + distance);
    }
}
