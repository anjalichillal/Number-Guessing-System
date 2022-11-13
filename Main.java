import java.util.Scanner;

public class Main{
	public static void
	guessingNumberGame()
	{
		Scanner s = new Scanner(System.in);
		int num = 1 + (int)(100
		* Math.random());
		int a= 5;

		int i, gs;

		System.out.println(
			"Choose the number"
			+ " between 1 to 100."
			+ "Guess the number"
			+ "in 5 try.");
		for (i = 0; i < a; i++) {

			System.out.println(
				"Guess the number:");

			gs = s.nextInt();

			if (num == gs) {
				System.out.println(
					"Successfully!"
					+ " You guess the number. You Win Game...");
				break;
			}
			else if (num > gs
					&& i != a - 1) {
				System.out.println(
					"Number is "
					+ "greater than " + gs);
			}
			else if (num < gs
					&& i != a - 1) {
				System.out.println(
					"Number is"
					+ " less than " + gs);
			}
		}

		if (i == a) {
			System.out.println(
				"You have exhausted"
				+ " a trials.");

			System.out.println(
				"Number is " + num);
		}
	}

	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
