public class FlipCoin {
	public static void main( String [] args ) {
	int headCount = 0;
	int tailCount = 0;
	System.out.println( "Welcome to Coin Flip Game" );
		for (int i=0;i<1000;i++) {
		double flip= Math.floor(Math.random() * 10) % 2;
			if (flip == 0)
			{
			headCount++;
			}
			else
			{
			tailCount++;
			}
		}
	double head = headCount / 1000;
        double tail = tailCount / 1000;
        double headPercentage = head * 100;
        double tailPercentage = tail * 100;
        System.out.println("Times head was flipped:" + headCount);
	System.out.println("Times tail was flipped:" + tailCount);
	System.out.println("Percentage of Head obtained:" + headPercentage);
	System.out.println("Percentage of Tail obtained:" + tailPercentage);
        }
}
