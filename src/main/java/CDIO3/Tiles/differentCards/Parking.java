package CDIO3.Tiles.differentCards;


import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Parking extends Tile{

    public Parking(int tileNR) {
        super(Color.special, Lang.getSring(13), tileNR, 0, -1);
    }
    @Override
    public void landOn(Player[] players, int currentplayer, Board table) {
        
    }

    
}