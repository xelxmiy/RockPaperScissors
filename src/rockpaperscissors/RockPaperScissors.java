package rockpaperscissors;

/**
 * @author Adam Belski
 * @version 1.0.0
 * @since 08-Feb-2023
 */
public class RockPaperScissors {
  public static void main(String[] args) {
      MainScreen scr = new MainScreen();
      scr.setLocationRelativeTo(null);
      scr.setVisible(true);

    }
    // winner logic
    public static String CheckWin(String playerChoice, String computerChoice) {
        //if the two choices are equal, it's a tie
        if (playerChoice.equals(computerChoice)) {
            return("It's a tie!");
            //check winning cases, if we don't win or tie we lose (duh)
        } else if ("rock".equals(playerChoice) && "scissors".equals(computerChoice) ||
               "paper".equals(playerChoice) && "rock".equals(computerChoice) ||
               "scissors".equals(playerChoice) && "paper".equals(computerChoice)) {
               WinLoseScreen.PlayerScore++;
               return("You win!");
            } else {
                WinLoseScreen.ComputerScore++;
                return("Computer wins!");
            }
        }
    
}
 
