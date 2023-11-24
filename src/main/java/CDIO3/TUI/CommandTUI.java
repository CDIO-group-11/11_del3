package CDIO3.TUI;

public class CommandTUI {
  final public static String UP = "\r\033[1A";
  final public static String SKIP = "\033[1C";
  final public static String CLEAR = "\033[2J";
  final public static String RESET = "\u001b[0m";
  private static boolean clean = false;
  public static void up(int distance){
    if(clean){
      System.out.print("\n".repeat(56));
      return;
    }
    System.out.print("\r\033[" + distance + "A");
  }
  public static void upBoard(){
    if(clean){
      System.out.print("\n".repeat(56));
      return;
    }
    up(MiddlePiece.height * 5 + CornerPiece.height * 2);
  }
  public static void skip(int distance){
    if(clean){
      System.out.print(" ".repeat(distance));
      return;
    }
    System.out.print("\033[" + distance + "C");
  }
  public static void skipTo(int point){
    if(clean){
      System.out.print("\r" + " ".repeat(point));
      return;
    }
    System.out.print("\033[" + point + "G");
  }
  public static void setPoint(int vertical, int horizontal){
    if(clean){
      System.out.print("\n".repeat(56));
      return;
    }
    String out = "\033[";
    out += horizontal > 0 ? horizontal : 1;
    out += ";";
    out += vertical > 0 ? vertical : 1;
    out += "H";
    System.out.print(out);
  }
  public static void clearAll(){
    if(clean){
      System.out.print("\n".repeat(56));
      return;
    }
    System.out.print("\033[2J");
    setPoint(0, 0);
  }
  public static void clearLine(){
    if(clean){
      System.out.print(" ".repeat(56) + "\r");
      return;
    }
    System.out.print("\r\033[1J");
  }
  public static void setColor(int r, int g, int b){
    if (clean) return;
    System.out.print("\033[38;2;" + r + ";" + g + ";" + b + "m");
  }
  public static String getColor(int r, int g, int b){
    if (clean) return "";
    return "\033[38;2;" + r + ";" + g + ";" + b + "m";
  }
  public static void setColor(int n){
    if (clean) return;
    System.out.print("\033[38;5;" + n + "m");
  }
  public static String getColor(int n){
    if (clean) return "";
    return "\033[38;5;" + n + "m";
  }
  public static void noColor() {
    clean = true;
  }
}
