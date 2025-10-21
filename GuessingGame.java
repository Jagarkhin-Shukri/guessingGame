public class GuessingGame {
  public static void main(String[] args) {

    Guesser guesser = new Guesser(0, 1000);
    System.out.println("Guesser-objekt");

    guesser.start();
  }
}
