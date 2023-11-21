package CDIO3.properties_handeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;

public class Buy {
    private static boolean HaveMoney(int price,int playermoney) {
        if(price <= playermoney){
            return true;
        }
        return false;
    }

    public static boolean buytial(Tile tile, Player player) {
        if(HaveMoney(tile.price, player.getWallet().get$())){
            player.setOwnedBy(tile.getNumber());
            player.getWallet().addMoney(-tile.price);
            tile.setOwnedBy(1);

            return true;
        } 
        return false;
    }
}