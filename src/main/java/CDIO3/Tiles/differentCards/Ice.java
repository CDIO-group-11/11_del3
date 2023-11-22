package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Ice extends Tile{

    public Ice(int tileNR) {
        super(Color.brown, "Ice cream parlour", tileNR, 1, -1);
    }

    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}