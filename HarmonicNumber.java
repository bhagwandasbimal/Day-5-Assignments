import java.util.Scanner;
public class HarmonicNumber {
	public static void main(String[] args) {
        	Scanner term = new Scanner(System.in);
        	int n;
        	double add = 0;
        	System.out.println("Please Enter the number of terms to add");
        	n = term.nextInt();
        	term.close();
        	for (int i = 1; i <= n; i++) {
            	add = add + 1 / i;
        	}
        	System.out.println("Harmonic sum is : " + add);
    }
}
