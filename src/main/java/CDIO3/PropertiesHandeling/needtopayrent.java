package CDIO3.PropertiesHandeling;

import CDIO3.Tiles.Tile;

public class needtopayrent {
    public static boolean NeedtoPayRent(Tile tile){
        if (tile.getOwnedBy() != -1){
            return true;
        }
        return false;
    }
}
