public class SnakeAndLadderUC1 {
	public static void main(String[] args) {
		System.out.println( "Welcome to Snakes And Ladders" );
		int win= 100;
		int start= 0;
		double roll = Math.floor(Math.random() * 10) % 6;
		if (roll == 1.0)
		{
			System.out.println( "You got " +roll);
			System.out.println( "You are at " +roll);
		}
		else
		{
			System.out.println( "You got " +roll);
			System.out.println( "You need to reroll" );
		}
	}
}
