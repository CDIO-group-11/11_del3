package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Park extends Tile{

    public Park(int tileNR) {
        super(Color.dark_blue, Lang.getSring(12), tileNR, 5, -1);
    }
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
} 