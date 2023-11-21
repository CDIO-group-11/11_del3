package CDIO3.Tiles.differentCards;

import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

/**
 * Test
 */
public class TestTile extends Tile {

  public TestTile(int tileNR) {
    super(Color.values()[(int)(Math.random()*Color.values().length)], "Testing Tile", tileNR);
  }
  public TestTile() {
    super(Color.values()[(int)(Math.random()*Color.values().length)], "Testing Tile", (int)(Math.random()*24));
  }
  
}