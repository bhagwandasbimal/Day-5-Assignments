import java.util.Scanner;
public class LineComparision {
	Scanner s = new Scanner(System.in);
	double length1,length2;
		public static void main(String[] args) {
        	System.out.println("Welcome to Line Comparision program by class method");
        	LineComparision lineMethods = new LineComparision();
        	lineMethods.compareTo();
        	lineMethods.equalTo();
		}
		public double lengthOfLine1() {
        	System.out.println("Please enter x1 co-ordinate of first line: ");
        	int x1 = s.nextInt();
        	System.out.println("Please enter y1 co-ordinate of first line: ");
        	int y1 = s.nextInt();
        	System.out.println("Please enter x2 co-ordinate of first line: ");
        	int x2 = s.nextInt();
        	System.out.println("Please enter y2 co-ordinate of first line: ");
        	int y2 = s.nextInt();
        	length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        	System.out.println("length of First line: " + length1);
        	return length1;
		}
		public double lengthOfLine2() {
        	System.out.println("Please enter x1 co-ordinate of second line: ");
        	int p1 = s.nextInt();
        	System.out.println("Please enter y1 co-ordinate of second line: ");
        	int q1 = s.nextInt();
        	System.out.println("Please enter x2 co-ordinate of second line: ");
        	int p2 = s.nextInt();
        	System.out.println("Please enter y2 co-ordinate of second line: ");
        	int q2 = s.nextInt();
        	length2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
        	System.out.println("length of Line2: " + length2);
        	return length2;
		}
		double line1Length=lengthOfLine1();
		double line2Length=lengthOfLine2();
		public void equalTo() {
		        if(line1Length == line2Length){
        			System.out.println("Lines are Equal");
        		}
			else {
         		System.out.println("lines are not equal");
        		}
		}
		public void compareTo() {
	        	if (length1 > length2) {
        		System.out.println("First line is greater");
        		}
			else if (length1 < length2) {
        		System.out.println("Second line is greater");
        		}
			else {
        		System.out.println("Both Lines are Equal");
        		}
		}
}
