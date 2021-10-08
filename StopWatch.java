import java.util.Scanner;
public class StopWatch {
	public static void main(String[] args) {
	System.out.println("Welcome to Stopwatch Programme");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 to start :");
        long startTime = System.currentTimeMillis();
        sc.nextFloat();
        System.out.print("Enter 1 to stop :");
        sc.nextFloat();
        sc.close();
        long finishTime = System.currentTimeMillis();
        long timeElapsed = (finishTime - startTime) / 1000;
        System.out.print("Time between two was in second: " + timeElapsed);
	}
}
