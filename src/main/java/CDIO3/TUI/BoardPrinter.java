package CDIO3.TUI;

import CDIO3.App;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class BoardPrinter {
  private BoardPiece[] boardPieces;
  public BoardPrinter(Board board){
    BoardPiece[] tempPieces = new BoardPiece[24];
    for (int i = 0; i < 24; i++) {
      Tile tile = board.getTile(i);
      if(i % 6 == 0){
        tempPieces[i] = new CornerPiece(tile);
      }else{
        tempPieces[i] = new MiddlePiece(tile);
      }
    }
    boardPieces = reAssembler(tempPieces);
  }
  private BoardPiece[] reAssembler(BoardPiece[] in){
    BoardPiece[] out = new BoardPiece[in.length];
    for (int i = 0; i < 7; i++) {//index 0->7
      out[i] = in[i];
    }
    for (int i = 0; i < 6; i++) {//index 7->19
      out[i * 2 + 7] = in[23 - i];
      out[i * 2 + 8] = in[7 + i];
    }
    for (int i = 0; i < 6; i++) {//index 19->24
      out[i+18] = in[17-i];
    }
    return out;
  }
  
  public String BoardAssembler(){
    String out = "";
    for (int j = 0; j < MiddlePiece.height; j++) {
      for (int i = 0; i < 7; i++) {//index 0->7
        out += boardPieces[i].getLine(j);
      }
      out += "\n";
    }
    
    //OBS i += 2
    for (int i = 7; i < 17; i += 2) {//index 7->17
      for (int j = 0; j < MiddlePiece.height; j++) {
        out += boardPieces[i].getLine(j);
        
        //spaces in the middle of the board
        out += " ".repeat(MiddlePiece.width).repeat(5);
        
        out += boardPieces[i+1].getLine(j);
        out += "\n";
      }
    }
    for (int j = 0; j < MiddlePiece.height; j++) {
      for (int i = 17; i < 24; i++) {//index 17->24
        out += boardPieces[i].getLine(j);
      }
      out += "\n";
    }
    return out;
  }
  private String setOwner(String board, String[] owners){
    for (int i = 0; i < owners.length; i++) {
      board = board.replace(new String(Character.toChars(0xE000 + i)), (owners[i] != null ? owners[i] : " "));
    }
    return board;
  }
  public void print(){
    System.out.println(setOwner(BoardAssembler(),App.getOwnerList()));
  }
  public void inspect(int tile) {
    boardPieces[tile].inspect();
  }
  public static void guide() {
    System.out.print(
      "┌──────────────┐\n"+
      Lang.getSring(22) + "\n"+
      "├─────┬────────┤\n"+
      Lang.getSring(23) + "\n"
    );
  }
  public int[] getOrder() {
    int[] out = new int[24];
    
    for (int i = 0; i < out.length; i++) {
      out[i] = boardPieces[i].getTileNR();
    }
    return out;
  }
}
