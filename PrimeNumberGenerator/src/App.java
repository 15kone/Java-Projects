import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Input the integer you want to print prime numbers until"
    );
    int largestNumber = sc.nextInt();

    for (int i = 1; i <= largestNumber; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
    sc.close();
  }

  private static boolean isPrime(int number) {
    for (int check = 2; check < number; check++) {
      if (number % check == 0) {
        return false;
      }
    }
    return true;
  }
}
