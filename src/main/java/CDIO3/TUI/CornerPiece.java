package CDIO3.TUI;

import CDIO3.Tiles.Tile;
import CDIO3.Tiles.differentCards.TestTile;
import CDIO3.lang.Lang;

public class CornerPiece implements BoardPiece {
  public String[] pieceLines;
  private Tile tile;
  final private String 
  horizontal = "\u2500",
  vertical = "\u2502",
  fullBlock = "\u2588",
  horizontalRight = "\u251C",
  horizontalLeft = "\u2524",
  verticalDown = "\u252C",
  topLeftCorner = "\u250C",
  topRightCorner = "\u2510";
  final static public int 
  width = 8,
  height = 4;

  public CornerPiece(Tile tile) {
    this.tile = tile;
    if(this.tile == null){
      this.tile = new TestTile();
    }
    pieceLines = generate(this.tile);
  }
  private String[] generate(Tile tile){
    String[] lines = new String[4];
    
    //close top of box
    lines[0] = topLeftCorner + horizontal.repeat(6) + topRightCorner;
    
    //color of the tile
    lines[1] = vertical + CommandTUI.getColor(tile.getColor().ansi) + fullBlock.repeat(6) + tile.getColor().resetAnsi + vertical;
    
    //split into to sections
    lines[2] = horizontalRight + horizontal.repeat(2) + verticalDown + horizontal.repeat(3) + horizontalLeft;
    
    //find tile number and write in constant length
    String tileNR = (tile.getNumber() + 1) + ""; tileNR += tileNR.length() < 2 ? " " : "";
    
    //write the owner and the tile number on the final tile
    lines[3] = vertical + "  " + vertical + "#" + tileNR + tile.getColor().resetAnsi + vertical;
    
    //return text
    return lines;
  }
  public String getLine(int lineID){
    if(lineID < 0 || lineID >= pieceLines.length) return Lang.getSring(30); 
    return pieceLines[lineID];
  }
  @Override
  public void inspect() {
    System.out.println(Lang.getSring(31) + tile.getName());
    System.out.println(Lang.getSring(32) + tile.getNumber());
    // TODOSystem.out.println("players on this tile: " + App.playerPossitionList()[tile.getNumber()]);
  }
  @Override
  public int getTileNR() {
    return tile.getNumber();
  }
}
