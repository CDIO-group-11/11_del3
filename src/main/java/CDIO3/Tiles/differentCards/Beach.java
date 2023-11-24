package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Beach extends Tile{

    public Beach(int tileNR) {
        super(Color.dark_blue, "Beach", tileNR, 5, -1);
    }
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}