package CDIO3.Tiles;

import CDIO3.Tiles.differentCards.TestTile;

public class Board {
  private Tile[] tiles = new Tile[24];
  public Board(){
    
  }
  public Tile getTile(int index){
    return tiles[index] != null ? tiles[index] : new TestTile(index);
  }
}
