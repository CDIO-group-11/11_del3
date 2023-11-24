package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Museum extends Tile{

    public Museum(int tileNR) {
        super(Color.pink, "Museum", tileNR, 2, -1);
    }
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}