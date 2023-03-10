package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void gameProcess(String questionMessage, String[][] roundData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(questionMessage);

        for (var round : roundData) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(round[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + round[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
