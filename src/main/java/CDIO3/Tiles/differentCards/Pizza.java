package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Pizza extends Tile{

    public Pizza(int tileNR) {
        super(Color.brown, Lang.getSring(15), tileNR, 1, -1);
    }
    
}