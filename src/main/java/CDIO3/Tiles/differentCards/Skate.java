package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Skate extends Tile{

    public Skate(int tileNR) {
        super(Color.brown, Lang.getSring(16), tileNR, 2, -1);
    }
    
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}