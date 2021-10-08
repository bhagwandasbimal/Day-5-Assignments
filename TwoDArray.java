import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
        System.out.println("Welcome to 2D-array printing programme");
	int x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the no.of Columns: ");
        int column = sc.nextInt();
        sc.close();
        int[][] arr = new int[row][column];
        	for (int i = 0; i < row; i++) {
        		for (int j = 0; j < column; j++) {
                	arr[i][j] = x;
                	System.out.print("arr[" + i + "," + j + "]=" + arr[i][j] +"   ");
                	x++;
                	}
        	System.out.println();
        	}
	}
}
