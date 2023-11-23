package CDIO3.properties_handeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;

public class Getrent {
    public static boolean getRent(Player player, Tile tile){
        int rentPrice = tile.getPrice();
        player.getWallet().addMoney(rentPrice);
        return true;
    }

}
