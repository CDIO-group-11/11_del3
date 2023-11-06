package CDIO3.Tiles;

public enum Color {
  brown     (94,'e'),
  orange    (208,'e'),
  dark_blue (33,'e'),
  light_blue(14,'e'),
  red       (196,'e'),
  pink      (207,'e'),
  yellow    (220,'e'),
  green     (34,'e'),
  special   (242,'e');
  public int ansi;
  public char identifier;
  private Color(int ansi, char identifier){
    this.ansi = ansi;
    this.identifier = identifier;
  }
}
