package CDIO3;

import CDIO1.RaffleCup;
import CDIO3.Player.Player;
import CDIO3.TUI.CommandTUI;
import CDIO3.TUI.TUI_Manager;
import CDIO3.TUI.UserInput;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;
import CDIO3.lang.Language;

import java.lang.IllegalArgumentException;
/**
 * Hello world!
 *
 */
public class App {
  private static Player[] players;
  private static RaffleCup cup = new RaffleCup(1,6);
  private static Board table = new Board(); ;
  private static TUI_Manager TUI = new TUI_Manager(table);
  private static int currentPlayer = 0, previusPlayer = -1;
  public static void main( String[] args ){
    init(args);
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
      currentPlayer %= Player.PlayerAmount;
    }
  }
  private static void init(String[] args) {
    boolean langSet = false, cleanSet = false, playerSet = false;
    
    for (int i = 0; i < args.length; i++) {
      String in = (args[i].split("=").length > 0 ? args[i].split("=")[0] : args[i]);
      switch (in) {
        case "lang":
        case "Lang":
        case "Language":
        case "-L":
          if(langSet) throw new IllegalArgumentException("only one language argument allowed\n\t one found at: " + i + " (" + args[i] + ")");
          setLang(args[i]);
          langSet = true;
          break;
        case "clean":
        case "-c":
        case "clear":
        case "noColor":
          if(cleanSet) throw new IllegalArgumentException("only one color argument allowed\n\t one found at: " + i + " (" + args[i] + ")");
          noColor(args[i]);
          cleanSet = true;
          break;
        case "color":
        case "unClean":
        case "-C":
          if(cleanSet) throw new IllegalArgumentException("only one color argument allowed\n\t one found at: " + i + " (" + args[i] + ")");
          color(args[i]);
          cleanSet = true;
        case "playerCount":
        case "-p":
        case "playCount":
        case "-P":
          if(playerSet) throw new IllegalArgumentException("only one playerCount argument allowed\n\t one found at: " + i + " (" + args[i] + ")");
          setPlayerCount(args[i]);
          playerSet = true;
        default:
          break;
      }
    }
    if(!playerSet){
      int playerCount = UserInput.getInt(Lang.getSring(0),2,4);
      Player.PlayerAmount = playerCount;
    }
    players = new Player[Player.PlayerAmount];
    for (int i = 0; i < Player.PlayerAmount ; i++) {
      players[i] = new Player();
    }
  }
  private static void setPlayerCount(String arg) {
    try {
      Player.PlayerAmount = Integer.parseInt(arg.split("=") [1]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("could not resolve the playercount from the argument: " + arg + "\n\texpected number format: " + "playerCount=3");
    }
  }
  private static void color(String args) {
    return;
  }
  private static void noColor(String args) {
    CommandTUI.noColor();
  }
  private static void setLang(String arg) {
    try {
      String in = arg.split("=")[1];
      for (int i = 0; i < Language.values().length; i++) {
        if(Language.values()[i].name().equals(in)){
          Lang.setLang(Language.values()[i]);
        }
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException("could not resolve the language from the argument: " + arg + "\n\texpected language format: " + "lang=en");
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
