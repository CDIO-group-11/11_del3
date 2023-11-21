package CDIO3.TUI;

import CDIO3.Player.Player;
import CDIO3.Tiles.Board;

public class TUI_Manager {
  private final static String [] actions = new String[]{
    "se information about all players",
    "roll for this turn",
    "take a closer look at a tile",
    "learn how to read a tile",
    "see the intire board"
  };
  private BoardPrinter print;
  public TUI_Manager(Board toBePrinted){
    print = new BoardPrinter(toBePrinted);
  }
  /**
   * reads a user input and shows the user the requested information to the user
   * @return on roll command, when the  user rolls
   */
  public void readTurn(int die1, int currentPlayer, Player[] players){
    while (true) {
      Commands command = UserInput.getCommand(actions,"please choose an action");
      switch (command) {
        case detail:
          System.out.println("details");
          break;
        case roll:
          return;
        case inspect:
          print.inspect(UserInput.getInt("which piece do you wish to inspect: ",1,24)-1);
          break;
        case guide:
          BoardPrinter.guide();
          break;
        case board:
          print.print();
          break;
      }
    }
  }
}
