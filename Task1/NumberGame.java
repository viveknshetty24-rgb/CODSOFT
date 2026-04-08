import java.util.Scanner;//To take user input
import java.util.Random;//To generate a random number
public class NumberGame {
     public static void main(String[] args) {
          String playAgain = "Yes";// if user wants to play again
          int roundsWon = 0;
          Random random = new Random();
          Scanner sc = new Scanner(System.in);// scanner object
          while (playAgain.equalsIgnoreCase("Yes")) {
               int numberToGuess = random.nextInt(100) + 1;//number which the user has to guess
               int playerguess = 0;
               int attempts = 0;
               int maxAttempts = 10;// maximum attempts that user gets
               while (playerguess != numberToGuess && attempts < maxAttempts) {
                    System.out.println("Enter your guess(1-100):");
                    playerguess = sc.nextInt();
                    attempts++;
                    if (playerguess < numberToGuess) {
                         System.out.println("Your Guess is too Low Try Again!");
                    } else if (playerguess > numberToGuess) {
                         System.out.println("Your Guess is too High Try Again!");
                    } else {
                         System.out.println("Congragulations You guessed correct in " + attempts + " Attempts");
                         roundsWon++;
                    }
               }
               if (playerguess != numberToGuess) //number of attempts exceededS
               {
                    System.out.println("Sorry! You've used all attempts. The number was " + numberToGuess);
               }
               System.out.println("Do you want to play again? (Yes/No)");
               playAgain = sc.next();//whether user wants to play again
          }
          System.out.println("You won " + roundsWon + " rounds!");//number of rounds won by user
          sc.close();
     }
}
