import java.util.Random;
import java.util.Scanner;

public class HiLo
{
	public static void main (String[] args)
	{
		Random generator = new Random();
		int randomNumber = generator.nextInt(100);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1-100: ");
		int number = input.nextInt();

		if (number > randomNumber)
			System.out.println("Too high!");
		else if (number == randomNumber)
			System.out.println("You got it!");
		else
			System.out.println("Too low!");

		System.out.println("The right answer is " + randomNumber);
	}
}