package CDIO3.TUI;

public class TUI_MOVE {
  public static void up(int distance){
    System.out.print("\r\033[" + distance + "A");
  }
  public static void upBoard(){
    up(MiddlePiece.height * 5 + CornerPiece.height * 2);
  }
  public static void skip(int distance){
    System.out.print("\033[" + distance + "C");
  }
  public static void setPoint(int vertical, int horizontal){
    String out = "\033[";
    out += horizontal > 0 ? horizontal : 1;
    out += vertical > 0 ? vertical : 1;
    out += "H";
    System.out.print(out);
  }
  public static void clear(){
    System.out.print("\033[2J");
  }
  public static void setColor(int r, int g, int b){
    System.out.print("\033[2;" + r + ";" + g + ";" + b + "m");
  }
  public static void setColor(int n){
    System.out.print("\033[5;" + n + "m");
  }
}
