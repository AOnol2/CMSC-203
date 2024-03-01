/*
 * Class: CMSC203 CRN 32689 
 * Instructor: Dr. Grinberg
 * Description: Write a program that tests your ESP (extrasensory perception) using colors.
 * Due: 02/07/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Ata Onol
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

    public static void main(String[] args) {
        final String CHOICE_ONE = "Red";
        final String CHOICE_TWO = "Green";
        final String CHOICE_THREE = "Purple";
        final String CHOICE_FOUR = "Black";
        final String CHOICE_FIVE = "Yellow";
        final String CHOICE_SIX = "Blue";
        final String CHOICE_SEVEN = "Orange";
        
        final int TRIALS = 11;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
     //Display the Intro
     System.out.println("Welcome to the Extrasensory Perception Game!");
     System.out.print("Please enter your name: ");
     String participantName = scanner.nextLine();

     System.out.print("Share something about yourself: ");
     String participantFact = scanner.nextLine();

     System.out.print("What's the due date (MM/DD/YY)? ");
     String challengeDeadline = scanner.nextLine();

     System.out.println("CMSC203 Assignment1: Test your psychic powers!");
        
     //Set up the game question and amount of trials
     int score = 0;
     
        for (int i = 1; i <= TRIALS; i++) {
            System.out.println("\nAttempt " + i);
            System.out.println("Can you guess the color I am thinking of?");
            int colorIndex = random.nextInt(7) + 1;
            String psychicColor = colorIndex == 1 ? CHOICE_ONE : colorIndex == 2 ? CHOICE_TWO : colorIndex == 3 ? CHOICE_THREE :
                                colorIndex == 4 ? CHOICE_FOUR : colorIndex == 5 ? CHOICE_FIVE : colorIndex == 6 ? CHOICE_SIX : CHOICE_SEVEN;

            System.out.println("Choose your color: Purple, Black, Red, Green, Yellow, Blue, Orange");
            String guess = scanner.nextLine().trim();
            
            
            //Display results of guess
            while (!(guess.equalsIgnoreCase(CHOICE_ONE) || guess.equalsIgnoreCase(CHOICE_TWO) || guess.equalsIgnoreCase(CHOICE_THREE) ||
                     guess.equalsIgnoreCase(CHOICE_FOUR) || guess.equalsIgnoreCase(CHOICE_FIVE) || guess.equalsIgnoreCase(CHOICE_SIX) ||
                     guess.equalsIgnoreCase(CHOICE_SEVEN))) {
                System.out.println("Invalid color! Please try again with using one of the 7 colors: Red, Green, Purple, Black, Yellow, Blue, Orange");
                guess = scanner.nextLine().trim();
            }

            if (guess.equalsIgnoreCase(psychicColor)) {
                score++;
                System.out.println("Great job! You've matched the color I was thinking of: " + psychicColor);
            } else {
                System.out.println("Wrong. The answer I was thinking of was: " + psychicColor);
            }
        }

        //Display Outro
        System.out.println("\nGame Over, thanks for playing!");
        System.out.println("You guessed: " + score + "/" + TRIALS + "correct.");
        System.out.println("Stduent name: " + participantName);
        System.out.println("User Description: " + participantFact);
        System.out.println("Due Date: " + challengeDeadline);

        scanner.close();
    }
}