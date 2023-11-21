package CDIO3.Tiles;

public abstract class Tile {
  protected Color color;
  protected String name;
  protected int tileNR;
  public Tile(Color color, String name, int tileNR){
    this.color = color;
    this.name = name;
    this.tileNR = tileNR;
  }
  public String getName() {
    return name;
  }
  public Color getColor() {
    return color;
  }
  public int getNumber() {
    return tileNR;
  }
}
