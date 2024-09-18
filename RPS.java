import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter Rock, paper, Scissors");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("Rock") && userChoice.equalsIgnoreCase("Paper") && userChoice.equalsIgnoreCase("Scissors")){
                System.out.println("Invalid choice. please enter Rock, paper or Scissors,");
                continue;
            }
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex ];
            System.out.println("Computer choice: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)){
                System.out.println("It's a tie");
            }else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                    (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            }else {
                System.out.println("You lose!");
            }
            System.out.println("Do you want to play again ? (YES OR NO)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("YES")){
                playAgain = true;
            }else{
                playAgain = false;
                System.out.println("Thanks for playing");
            }
        }
        scanner.close();
    }
}