package CDIO3.Tiles;

public class Board {
    private Tile[] tiles = new Tile[24];
public Board(){

}
  public Tile getTile(int index){
    return tiles[index];
  }
}
