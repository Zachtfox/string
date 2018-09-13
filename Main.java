package main.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String answer1 = "True";
        String answer2 = "2";
        String answer3 = "7";
        String answer4 = "8";
        String answer5 = "6";


        System.out.println("Please fill in the blanks");

        System.out.println("The tv show FRIENDS ran for 10 Seasons. True of False?");
        String guess1 = scan.nextLine();
        if (guess1.equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect. The answer is: " + answer1);
        }


        System.out.println("Barack Obama was president for ---- term(s)");
        String guess2 = scan.nextLine();
        if (guess2.equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect. The answer is: " + answer2);
        }

        System.out.println("There are ---- Continents on Earth.");
        String guess3 = scan.nextLine();
        if (guess3.equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect. The answer is: " + answer3);
        }
        System.out.println("Now that Pluto is no longer considered a planet, there are ---- planets in the solar system");
        String guess4 = scan.nextLine();
        if (guess4.equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score = score + 1;
        }
        else {
            System.out.println("Incorrect. The answer is: " + answer4);
        }
        System.out.println("Lady Gaga has ---- Grammy awards.");
        String guess5 = scan.nextLine();
        if (guess5.equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score = score + 1;
        }
        else {
            System.out.println("Incorrect. The answer is: " + answer5);
        }
        System.out.println("Your final score is: " + score);
    }
}
