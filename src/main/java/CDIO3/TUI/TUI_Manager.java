package CDIO3.TUI;

import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.lang.Lang;

public class TUI_Manager {
  private BoardPrinter print;
  public TUI_Manager(Board toBePrinted){
    print = new BoardPrinter(toBePrinted);
  }
  /**
   * reads a user input and shows the user the requested information to the user
   * @return on roll command, when the  user rolls
   */
  public void readTurn(int die1, int currentPlayer, int previusPlayer, Player[] players, Board board){
    detailPrint(die1, currentPlayer, previusPlayer, players, board);
    while (true) {
      Commands command = UserInput.getCommand(Lang.getSring(34));
      switch (command) {
        case detail:
          detailPrint(die1,currentPlayer, previusPlayer, players, board);
          break;
        case roll:
          return;
        case inspect:
          print.inspect(UserInput.getInt(Lang.getSring(35),1,24)-1);
          break;
        case guide:
          BoardPrinter.guide();
          break;
        case board:
          print.print();
          break;
        case ownerList:
          ownerList(players, board);
          break;
      }
    }
  }

  public void detailPrint(int die1, int currentPlayer, int previusPlayer, Player[] players, Board table){
    CommandTUI.clearAll();
    System.out.println(Lang.getSring(36) + players[0].getNrOfTilesOwned());
    System.out.println(Lang.getSring(40) + players[0].getWallet().get$() + " M\n");
    
    System.out.println(Lang.getSring(37) + players[1].getNrOfTilesOwned());
    System.out.println(Lang.getSring(40) + players[1].getWallet().get$() + " M\n");
    if(players.length > 2){
      System.out.println(Lang.getSring(38) + players[2].getNrOfTilesOwned());
      System.out.println(Lang.getSring(40) + players[2].getWallet().get$() + " M\n");
    }
    if(players.length > 3){
      System.out.println(Lang.getSring(39) + players[3].getNrOfTilesOwned());
      System.out.println(Lang.getSring(40) + players[3].getWallet().get$() + " M\n");
    }
    System.out.println();
    
    if(die1 != -1){
      System.out.println(Lang.getSring(46) + (previusPlayer + 1) + Lang.getSring(41) + die1);
      System.out.println(Lang.getSring(42) + (players[previusPlayer].getPiece().getPosition() + 1));
      System.out.println(Lang.getSring(43) + table.getTile(players[previusPlayer].getPiece().getPosition()).getName());
    }
    System.out.println();
    
    System.out.println(Lang.getSring(44) + (currentPlayer + 1));
    System.out.println(Lang.getSring(45) + (players[currentPlayer].getPiece().getPosition() + 1));
    System.out.println(Lang.getSring(43) + table.getTile(players[currentPlayer].getPiece().getPosition()).getName());
    System.out.println();
    
    print.print();
  }

  public void ownerList(Player[] players, Board table){
    boolean[] own = new boolean[24];
    for (int i = 0; i < players.length; i++) {
      System.out.println(Lang.getSring(46) + (i + 1));
      if(players[i].getNrOfTilesOwned() > 0){
        int[] owned = players[i].getTilesOwned();
        for (int j = 0; j < players[i].getNrOfTilesOwned(); j++) {
          System.out.println(Lang.getSring(47) + table.getTile(owned[i]).getName());
          own[owned[i]] = true;
        }
      }else{
        System.out.println(Lang.getSring(48));
      }
    }
    System.out.println(Lang.getSring(49));
    for (int i = 0; i < own.length; i++) {
      if(!own[i]){
        if(table.getTile(i).getPrice() > 0){
          System.out.print(Lang.getSring(47) + table.getTile(i).getName());
          CommandTUI.skipTo(35);
          System.out.println(Lang.getSring(50) + table.getTile(i).getPrice());
        }
      }
    }
  }
}

