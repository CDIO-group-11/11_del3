package CDIO3.Tiles;


public abstract class Tile {
  protected Color color;
  protected String name;
  protected int tileNR;
  public int price;  
  protected int ownedBy;


  public Tile(Color color, String name, int tileNR, int price, int ownedBy){
    this.color = color;
    this.name = name;
    this.tileNR = tileNR;
    this.price = price;
    this.ownedBy = ownedBy;
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
  public int getPrice() {
    return price;
  }
  public int getOwnedBy() {
    return ownedBy;
  }  
  public void setOwnedBy(int newOwner) {
    this.ownedBy = newOwner;
  }
  abstract public void landOn();
}
