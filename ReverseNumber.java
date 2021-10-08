import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
	int remainder = 0;
	int reverse = 0;
	int num = 0;
        System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
        sc.close();
        	while (num != 0) {
        	remainder = num % 10;
        	reverse = reverse * 10 + remainder;
        	num = num / 10;
		}
        System.out.println(reverse);
	}
}
