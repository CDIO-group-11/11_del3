package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class CornerPiece implements BoardPiece {
  public String[] pieceLines;
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
    pieceLines = generate(tile);
  }
  private String[] generate(Tile tile){
    String[] lines = new String[4];
    
    //close top of box
    lines[0] = topLeftCorner + horizontal.repeat(6) + topRightCorner;
    
    //color of the tile
    lines[1] = vertical + "\u001b[38;5;" + tile.getColor().ansi + "m" + fullBlock.repeat(6) + tile.getColor().resetAnsi + vertical;
    
    //split into to sections
    lines[2] = horizontalRight + horizontal.repeat(2) + verticalDown + horizontal.repeat(3) + horizontalLeft;
    
    //find tile number and write in constant length
    String tileNR = (tile.getNumber() + 1) + ""; tileNR += tileNR.length() < 2 ? " " : "";
    
    //write the owner and the tile number on the final tile
    lines[3] = vertical+ "\033[4m" + "  " + vertical + "#" + tileNR + tile.getColor().resetAnsi + vertical;
    
    //return text
    return lines;
  }
  public String getLine(int lineID){
    if(lineID < 0 || lineID >= pieceLines.length) return "missing line"; 
    return pieceLines[lineID];
  }
}