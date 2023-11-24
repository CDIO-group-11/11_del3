package CDIO3.PropertiesHandeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Tile;

public class payRent{
    
    public static boolean pay_Rent(Tile tile, Player[] players, int currentPlayer, Board table){
        int renttopay = 0;
        renttopay += tile.getPrice();
        for (int i = 0; i < 24; i++){
            if (tile.getColor() == table.getTile(i).getColor() || tile.getNumber() != i){
                if (tile.getOwnedBy() == table.getTile(i).getOwnedBy()){    
                    renttopay += table.getTile(i).getPrice();
                    break;
                }
            }
        }
        if(renttopay <= players[currentPlayer].getWallet().get$()){
            players[currentPlayer].getWallet().addMoney(renttopay * -1);
            int owner = tile.getOwnedBy();
            players[owner].getWallet().addMoney(renttopay);
            return true;
        }
        return false;
    }

}