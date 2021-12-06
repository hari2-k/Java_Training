import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args){
        System.out.println("Number Guessing Game ");
        System.out.println("Think of a number from 1 to 100");
        System.out.println("Enter \"higher\" if the guess is too low");
        System.out.println("Enter \"lower\" if the guess is too high");
        System.out.println("Enter \"correct\" if the guess is correct");

        Scanner scanner = new Scanner(System.in);
        String input;
        int min = 1;
        int max = 100;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("The number is " + randomNumber);
            System.out.println("Enter your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } else if (input.equals("lower")) {
                max = randomNumber - 1;
            } else if (input.equals("correct")) {
                break;
            }

            if (min == max + 1) {
                System.out.println("\nThat's not possible.Try again");
                min = 1;
                max = 100;
            }
        }
    }
}
