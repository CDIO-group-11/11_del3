package CDIO3;

import CDIO1.RaffleCup;
import CDIO3.Player.Player;
import CDIO3.TUI.TUI_Manager;
import CDIO3.TUI.UserInput;
import CDIO3.Tiles.Board;

/**
 * Hello world!
 *
 */
public class App {
  private static Player[] players;
  private static RaffleCup cup = new RaffleCup(1,6);
  private static TUI_Manager TUI;
  private static Board table;
  private static int currentPlayer;
  public static void main( String[] args ){
    int playerCount = UserInput.getInt("how many players will be in the game? ",2,4);
    players = new Player[playerCount];
    for (int i = 0; i < playerCount ; i++) {
      players[i] = new Player();
    }
    table = new Board();
    TUI = new TUI_Manager(table);
    int die0 = -1; 
    while (true) {
      TUI.readTurn(die0,currentPlayer,players);
      cup.roll();
      die0 = cup.getSides()[0];
      players[currentPlayer].getPiece();
    }
  }

  public static String[] getOwnerList() {
    return null;
  }

  public static String[] playerPossitionList() {
    return null;
  }
}
