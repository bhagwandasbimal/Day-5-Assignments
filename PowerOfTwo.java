import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
	System.out.println("Welcome to Power of Two Calculation Programme");
        int N = 0;
	int x = 0;
        System.out.println("Enter the power value : ");
	Scanner sc=new Scanner(System.in);
	N = sc.nextInt();
	sc.close();
        	for (int i = 1; i <= N; i++) {
        	x = (int) Math.pow(2, i);
        	}
	System.out.println(2 +" to the power of "+ N +" is "+ x);
	}
}
