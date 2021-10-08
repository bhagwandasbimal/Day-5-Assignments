import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(final String[] array) {
        System.out.println("Welcome to Even or Odd number checking programme");
        System.out.println("Please enter an integer");
        final int nextInt = new Scanner(System.in).nextInt();
        if (nextInt % 2 == 0) {
            System.out.println("Entered number is even");
        }
        else {
            System.out.println("Entered number is odd");
        }
    }
}
