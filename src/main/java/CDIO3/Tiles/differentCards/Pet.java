package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Pet extends Tile{

    public Pet(int tileNR) {
        super(Color.yellow, Lang.getSring(14), tileNR, 3, -1);
    }
    
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}