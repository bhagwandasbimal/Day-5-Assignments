import java.util.Scanner;
public class SumOfThreeEqZero {
	public static void main(String[] args) {
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter the no of integer to include in array:");
        int length = arr.nextInt();
        System.out.println("Enter the value for array:");
        int[] ar = new int[len];
        for(int i=0;i<length;i++)
        {
            ar[i]=arr.nextInt();
        }
        int count=0;
        for(int i=0;i<length-2;i++) {
            for (int j = i + 1; j < length - 1; j++)
            {
                for(int k=j+1;k<length;k++)
                {
                    if(ar[i] + ar[j] + ar[k] == 0)
                    {
                        System.out.println("("+ar[i]+" , "+ar[j]+" , "+ar[k]+")");
                        count++;
                    }
                }
            }

        }
        System.out.println("These are the distinct triplets equal to zero");
        System.out.println("There are "+count+" distinct triplets");
	}
}
