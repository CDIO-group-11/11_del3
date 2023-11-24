package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Candy extends Tile{

    public Candy(int tileNR) {
        super(Color.blight_blue, "Candy store", tileNR, 1, -1);
    }
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }

}