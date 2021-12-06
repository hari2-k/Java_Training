import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        System.out.println("Number Guessing Game");
        System.out.println("Think of a number from 1 to 100");
        System.out.println("Enter \"higher\" if the guess is too low");
        System.out.println("Enter \"lower\" if the guess is too high");
        System.out.println("Enter \"correct\" if the guess is correct");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        while (true) {
            System.out.println("\nThe number is " + guess);
            System.out.print("Enter your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            } else if (input.equals("correct")) {
                break;
            }

            guess = (min + max) / 2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible.Try again");
                min = 1;
                max = 100;
                guess = 50;
                }
            }
        }
    }
