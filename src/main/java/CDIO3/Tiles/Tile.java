package CDIO3.Tiles;

public abstract class Tile {
  protected Color color;
  protected String name;
  public Tile(Color color, String name){
    this.color = color;
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public Color getColor() {
    return color;
  }
}
