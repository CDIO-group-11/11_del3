package CDIO3.Tiles.differentCards;

import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

/**
 * Test
 */
public class TestTile extends Tile {

  public TestTile(int tileNR) {
    super(Color.values()[(int)(Math.random()*Color.values().length)], "Testing Tile", tileNR,1,-1);
  }
  public TestTile() {
    super(Color.values()[(int)(Math.random()*Color.values().length)], "Testing Tile", (int)(Math.random()*24),1,-1);
  }
  @Override
  public void landOn(Player[] players, int currentplayer, Board table) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'landOn'");
  }
}