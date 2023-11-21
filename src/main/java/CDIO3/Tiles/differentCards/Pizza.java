package CDIO3.Tiles.differentCards;

import CDIO3.Player.Player;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Pizza extends Tile{

    public Pizza(int tileNR) {
        super(Color.brown, "Pizza house", tileNR);
    }
    
    @Override
    public Player[] playerList() {
        throw new UnsupportedOperationException("Unimplemented method 'playerList'");
    }
}