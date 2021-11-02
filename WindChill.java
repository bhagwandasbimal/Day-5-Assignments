import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
	int t = 0;
	int v = 0;
	System.out.println("WindChill Calculation Programme using Equation");
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the temperature 't' (< 50) in Fahrenheit");
	t=sc.nextInt();
	System.out.println("Please enter the speed 'v' (3 < v < 120) in Miles per hour");
	v=sc.nextInt();
	sc.close();
		if (t < 50 && v > 3 && v < 120) {
        	double windChill = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        	System.out.println("WindChill is " + windChill);
		}
		else {
		System.out.println("Please enter the values of temperature and speed in given range");
		}
	}
}
