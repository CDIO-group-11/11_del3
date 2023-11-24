package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Arcade extends Tile{

    public Arcade(int tileNR) {
        super(Color.red, "Video game arcade", tileNR, 3, -1);
    }

    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }


}