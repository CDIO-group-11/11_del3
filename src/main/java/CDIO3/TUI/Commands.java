package CDIO3.TUI;

public enum Commands {
  detail("se information about all players"),
  roll("roll for this turn"),
  inspect("take a closer look at a tile"),
  guide("learn how to read a tile"),
  board("see the entire board"),
  ownerList("see what tiles all players own");

  public String message;
  private Commands(String message){
    this.message = message;
  }
}
