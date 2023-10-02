import java.util.Random;
import java.util.Scanner;

public class DiceGame extends Game {

    private int number;
    private int guess;
    private int timesTried = 0;
    private boolean isRight;
    private Scanner scanner;

    void initializeGame() {
        this.isRight = false;
        scanner = new Scanner(System.in);
        this.number = new Random().nextInt(6) + 1;
        System.out.println("Koita arvata nopan luku! (1-6)");
    }

    void makePlay(int player) {
        System.out.println("Kirjoita arvaus: ");
        guess = scanner.nextInt();

        if (guess == number) {
            isRight = true;
        }
        else {
            System.out.println("Yritä uudelleen.");
        }
        timesTried++;
    }

    boolean endOfGame() {
        return isRight;
    }

    void printWinner() {
        System.out.println("Voitit! Yritit yhteensä " + timesTried + " kertaa. Oikea numero oli " + number + ".");
    }
}
