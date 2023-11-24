package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Bowling extends Tile{

    public Bowling(int tileNR) {
        super(Color.green, "Bowling alley", tileNR, 4, -1);
    }

    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}