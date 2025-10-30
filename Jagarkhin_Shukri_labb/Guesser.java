import java.io.Console;
import java.util.Scanner;

public class Guesser {
  private int low;
  private int high;

  public Guesser(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public void start() {
    rules();
    doGuesses();
  }

  private void rules() {
    System.out.println("Think of a number between " +
        low + " and " + high);
    System.out.println("I'm going to ask a few questions in order " +
        "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

  private String getReply() {
    Scanner scanner = new Scanner(System.in);
    String reply = null;

    while (true) {
      reply = scanner.nextLine().trim().toUpperCase();

      if (reply.equals("T") || reply.equals("F")) {
        return reply;
      } else {
        System.out.println("Please answer T or F:");
      }

    }
  }

  private void doGuesses() {
    int i = 0;
    int middle = 0;
    while (low < high) {

      middle = low + (high - low) / 2;

      System.out.println("Is the number less than or equal to " +
          middle + "?");
      String reply = getReply();
      if ("T".equals(reply)) {

        high = middle;
      } else {

        low = middle + 1;
      }
      i++;
    }

    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses) {
    System.out.println("You were thinking about " +
        guess +
        " (took me " + numberOfGuesses +
        " guesses)");
  }

}
