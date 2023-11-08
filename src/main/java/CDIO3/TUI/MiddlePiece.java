package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class MiddlePiece implements BoardPiece{
  public String[] pieceLines;
  final private String 
  owner,
  horizontal = "-"/*"\u2015"*/,
  vertical = "|",
  fullBlock = "\u2588";
  final static public int 
  width = 8,
  height = 4;

  public MiddlePiece(Tile tile) {
    owner = getOwnerUni(tile.getNumber());
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
    lines[3] = vertical + owner.repeat(2) + vertical + "#" + tileNR + vertical;
    
    //return text
    return lines;
  }
  public String getLine(int lineID){
    if(lineID < 0 || lineID >= pieceLines.length) return "missing line"; 
    return pieceLines[lineID];
  }
  public String getOwnerUni(){
    return owner;
  }
  public String getOwnerUni(int tileNR){
    switch (tileNR) {
      case 0:
        return "\uE001";
      case 1:
        return "\uE001";
      case 2:
        return "\uE001";
      case 3:
        return "\uE001";
      case 4:
        return "\uE001";
      case 5:
        return "\uE001";
      case 6:
        return "\uE001";
      case 7:
        return "\uE001";
      case 8:
        return "\uE001";
      case 9:
        return "\uE001";
      case 10:
        return "\uE001";
      case 11:
        return "\uE001";
      case 12:
        return "\uE001";
      case 13:
        return "\uE001";
      case 14:
        return "\uE001";
      case 15:
        return "\uE001";
      case 16:
        return "\uE001";
      case 17:
        return "\uE001";
      case 18:
        return "\uE001";
      case 19:
        return "\uE001";
      case 20:
        return "\uE001";
      case 21:
        return "\uE001";
      case 22:
        return "\uE001";
      case 23:
        return "\uE001";
      default:
        return null;
    }
  }
}
