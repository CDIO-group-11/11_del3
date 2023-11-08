package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class Board_temp {
  Tile[] tiles;
  public Board_temp(Tile[] tiles){
    this.tiles = tiles;
  } 
  public Tile getTile(int i){
    return tiles[i];
  }

}
