package javaproject;
import java.util.Scanner;
import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess a number within the valid range.");
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}
