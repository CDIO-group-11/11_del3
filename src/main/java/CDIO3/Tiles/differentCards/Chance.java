package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Chance extends Tile{

    public Chance(int tileNR) {
        super(Color.special, "Chance", tileNR, 0, -1);
    }

    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}