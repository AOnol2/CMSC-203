/*
 * Class: CMSC203 CRN 32689 
 * Instructor: Dr. Grinberg
 * Description: Write a program that tests your ESP (extrasensory perception) using colors.
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Ata Onol
*/

import java.util.Scanner;

class main {
	final static String COLOR_RED = "Red";
    final static String COLOR_GREEN = "Green";
    final static String COLOR_BLUE = "Blue";
    final static String COLOR_ORANGE = "Orange";
    final static String COLOR_YELLOW = "Yellow";
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int correctGuesses = 0;
        final int rounds = 11;

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it " + COLOR_RED + ", " + COLOR_GREEN + ", " + COLOR_BLUE + ", " + COLOR_ORANGE + ", or " + COLOR_YELLOW + "?");

            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();

            while (!isValidColor(userGuess)) {
                System.out.println("You entered incorrect color. Is it " + COLOR_RED + ", " + COLOR_GREEN + ", " + COLOR_BLUE + ", " + COLOR_ORANGE + ", or " + COLOR_YELLOW + "?");
                System.out.print("Enter your guess again: ");
                userGuess = scanner.nextLine();
            }

            String randomColor = getRandomColor();

            System.out.println("\nI was thinking of " + randomColor);

            if (userGuess.equalsIgnoreCase(randomColor)) {
                correctGuesses++;
            }
        }

        System.out.println("\nGame Over\n");
        System.out.println("You guessed " + correctGuesses + " out of " + rounds + " colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);

        scanner.close();
    }

    private static boolean isValidColor(String color) {
        return color.equalsIgnoreCase(COLOR_RED) || color.equalsIgnoreCase(COLOR_GREEN) ||
                color.equalsIgnoreCase(COLOR_BLUE) || color.equalsIgnoreCase(COLOR_ORANGE) ||
                color.equalsIgnoreCase(COLOR_YELLOW);
    }

    private static String getRandomColor() {
        int randomIndex = (int) (Math.random() * 5);

        switch (randomIndex) {
            case 0:
                return COLOR_RED;
            case 1:
                return COLOR_GREEN;
            case 2:
                return COLOR_BLUE;
            case 3:
                return COLOR_ORANGE;
            default:
                return COLOR_YELLOW;
        }
    }
}