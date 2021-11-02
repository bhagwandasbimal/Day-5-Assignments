public class FlipCoin {
	public static void main(final String[] array) {
        int headCount = 0;
        int tailCount = 0;
	double HeadPercentage;
	double TailPercentage;
        System.out.println("Welcome to Coin Flip Game");
        for (int i = 0; i < 1000; i++) {
            if (Math.floor(Math.random() * 10.0) % 2.0 == 0.0) {
                headCount++;
            }
            else {
                tailCount++;
            }
        }
        HeadPercentage = (headCount*100)/1000;
	TailPercentage = (tailCount*100)/1000;
        System.out.println("Number of times heads obtained = "+headCount);
        System.out.println("Number of times tails obtained = "+tailCount);
        System.out.println("Percentage of head obtained = "+HeadPercentage);
        System.out.println("Percentage of tail obtained = "+TailPercentage);
    }
}
