package CDIO3.Tiles.differentCards;

import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Pizza extends Tile{

    public Pizza(int tileNR) {
        super(Color.brown, "Pizza house", tileNR, 1, -1);
    }
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}