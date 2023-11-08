package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class CornerPiece implements BoardPiece {
  public String[] pieceLines;
  final private String 
  horizontal = "-"/*"\u2015"*/,
  vertical = "|",
  fullBlock = "\u2588";
  final static public int 
  width = 8,
  height = 4;

  public CornerPiece(Tile tile) {
    pieceLines = generate(tile);
  }
  private String[] generate(Tile tile){
    String[] lines = new String[4];
    
    //close top of box
    lines[0] = "┌" + horizontal.repeat(6) + "┐";
    
    //color of the tile
    lines[1] = vertical + "\u001b[38;5;" + tile.getColor().ansi + "m" + fullBlock.repeat(6) + tile.getColor().resetAnsi + vertical;
    
    //split into to sections
    lines[2] = vertical + horizontal.repeat(2) + "┬" + horizontal.repeat(3) + vertical;
    
    //find tile number and write in constant length
    String tileNR = tile.getNumber() + ""; tileNR += tileNR.length() < 2 ? " " : "";
    
    //write the owner and the tile number on the final tile
    lines[3] = vertical + " ".repeat(2) + vertical + "#" + tileNR + vertical;
    
    //return text
    return lines;
  }
  public String getLine(int lineID){
    if(lineID < 0 || lineID >= pieceLines.length) return "missing line"; 
    return pieceLines[lineID];
  }
}
