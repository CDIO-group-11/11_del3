package CDIO3.PropertiesHandeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;

public class Buy {
    private static boolean HaveMoney(int price,int playermoney) {
        if(price <= playermoney){
            return true;
        }
        return false;
    }

    public static boolean buytial(Tile tile, Player player, int currentPlayer) {
        if(HaveMoney(tile.price, player.getWallet().get$())){
            player.setOwnedBy(tile.getNumber());
            player.getWallet().addMoney(-tile.price);
            tile.setOwnedBy(currentPlayer);

            return true; // returns true if its a successful purchase
        } 
        return false; // returns false if player do not have enough money
    }
}