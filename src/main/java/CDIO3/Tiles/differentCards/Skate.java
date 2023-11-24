package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Skate extends Tile{

    public Skate(int tileNR) {
        super(Color.orange, "Skate park", tileNR, 2, -1);
    }
    
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}