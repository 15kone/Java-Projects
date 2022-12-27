import java.util.Random;
import java.util.Scanner;

public class Main {

  public static int getRandomInt(int min, int max) {
    Random random = new Random();
    return random.ints(min, max + 1).findFirst().getAsInt(); // find the random int in range 0 - 50
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter player one's bet: ");
    int p1Bet = scanner.nextInt(); // take player 1's bet and store it in a variable
    System.out.println("Player one's bet is: " + p1Bet + " $!");

    System.out.println("Enter player's two bet: ");
    int p2Bet = scanner.nextInt();
    System.out.println("Player two's bet is: " + p2Bet + " $!");

    scanner.close();

    int total = p1Bet + p2Bet;

    System.out.println(total);

    System.out.println("Player 1 is Heads, Player 2 is Tails.");

    int randomResult = getRandomInt(0, 100);
    if (randomResult >= 50) {
      System.out.println(
        "It's heads!, Player 1 is the winner, and he wins: " + total + " $!"
      );
    } else {
      System.out.println(
        "It's tails!, Player 2 is the winner, and he wins: " + total + " $!"
      );
    }
  }
}
