package CDIO3.Tiles;

public abstract class Tile {
  protected Color color;
  protected String name;
  protected int number;
  public Tile(Color color, String name, int number){
    this.color = color;
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public Color getColor() {
    return color;
  }
  public int getNumber() {
    return number;
  }
}
