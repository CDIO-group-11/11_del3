package CDIO3.PropertiesHandeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;

public class payRent{

    public static boolean pay_Rent(Tile tile, Player[] players, int currentPlayer){
        if(tile.getOwnedBy() != -1){
            int rentPrice = tile.getPrice();
            players[currentPlayer].getWallet().addMoney(-rentPrice);
            int owner = tile.getOwnedBy();
            players[owner].getWallet().addMoney(rentPrice);
            return true;
        }
        return false;
    }

}