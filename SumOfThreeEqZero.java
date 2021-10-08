import java.util.Scanner;
public class SumOfThreeEqZero {
	public static void main(String[] args) {
        Scanner arr=new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int length=arr.nextInt();
	int count = 0;
        System.out.println("Please enter the numbers for the array:");
        int[] ar = new int[length];
        	for(int i=0;i<length;i++) {
        		ar[i]=arr.nextInt();
        	}
        	for(int i=0;i<length-2;i++) {
            		for (int j = i + 1; j < length - 1; j++) {
                		for(int k=j+1;k<length;k++) {
        				if(ar[i] + ar[j] + ar[k] == 0) {
                        		System.out.println("("+ar[i]+" , "+ar[j]+" , "+ar[k]+")");
                        		count++;
                			}
                		}
        		}
        	}
        System.out.println("These are the distinct triplets the sum of which equals to zero");
        System.out.println("There are "+count+" distinct triplets");
	}
}
