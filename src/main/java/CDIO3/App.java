package CDIO3;

import CDIO1.RaffleCup;
import CDIO3.Player.Player;
import CDIO3.TUI.TUI_Manager;
import CDIO3.TUI.UserInput;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Tile;

/**
 * Hello world!
 *
 */
public class App {
  private static Player[] players;
  private static RaffleCup cup = new RaffleCup(1,6);
  private static TUI_Manager TUI;
  private static Board table;
  private static int currentPlayer = 0, previusPlayer = -1;
  public static void main( String[] args ){
    int playerCount = UserInput.getInt("how many players will be in the game? ",2,4);
    players = new Player[playerCount];
    Player.PlayerAmount = playerCount;
    for (int i = 0; i < playerCount ; i++) {
      players[i] = new Player();
    }
    table = new Board();
    TUI = new TUI_Manager(table);
    int die0 = -1; 
    while (true) {
      TUI.readTurn(die0,currentPlayer, previusPlayer,players, table);
      cup.roll();
      die0 = cup.getSides()[0];
      players[currentPlayer].getPiece().move(die0);
      Tile land = table.getTile(players[currentPlayer].getPiece().getPosition());
      land.landOn();
      previusPlayer = currentPlayer;
      currentPlayer++;
      currentPlayer %= playerCount;
    }
  }
  public static String[] getOwnerList() {
    String[] owners = new String[24];
    for (int i = 0; i < owners.length; i++) {
      switch(table.getTile(i).getOwnedBy()){
        case 0:
        owners[i] = "@";
        break;
        case 1:
        owners[i] = "£";
        break;
        case 2:
        owners[i] = "$";
        break;
        case 3:
        owners[i] = "€";
        break;
      }
    }
    return owners;
  }
}
