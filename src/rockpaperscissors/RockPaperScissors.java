package rockpaperscissors;

/**
 * @author Adam Belski
 */
public class RockPaperScissors {
  public static void main(String[] args) {
      MainScreen scr = new MainScreen();
      scr.setLocationRelativeTo(null);
      scr.setVisible(true);

    }
    // check who wins
    public static String CheckWin(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return("It's a tie!");
        } else if (playerChoice == "rock" && computerChoice == "scissors" ||
               playerChoice == "paper" && computerChoice == "rock" ||
               playerChoice =="scissors" && computerChoice == "paper") {
               WinLoseScreen.PlayerScore++;
               return("You win!");
            } else {
                WinLoseScreen.ComputerScore++;
                return("Computer wins!");
            }
        }
    
}
 
