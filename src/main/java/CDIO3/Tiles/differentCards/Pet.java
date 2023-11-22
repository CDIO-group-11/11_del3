package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Pet extends Tile{

    public Pet(int tileNR) {
        super(Color.brown, "Pet store", tileNR, 3, -1);
    }
    
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}