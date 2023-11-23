package CDIO3.properties_handeling;

import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;

public class payRent{


    
    public static int pay_Rent(Tile tile, Player player){
        if(tile.getOwnedBy() != -1){
            int rentPrice = tile.getPrice();
            player.getWallet().addMoney(-rentPrice);
            return tile.getOwnedBy();
        }
        return -1;
    }

}