package CDIO3.TUI;

import CDIO3.lang.Lang;

public enum Commands {
  detail(24),
  roll(25),
  inspect(26),
  guide(27),
  board(28),
  ownerList(29);

  private int ID;
  private Commands(int ID){
    this.ID = ID;
  }
  public String getMessage(){
    return Lang.getSring(ID);
  }
}
