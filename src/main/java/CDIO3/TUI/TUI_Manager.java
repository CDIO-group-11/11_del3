package CDIO3.TUI;

public class TUI_Manager {
  private final static String [] actions = new String[]{"se information about all players","roll for this turn"};
  private static BoardPrinter print = new BoardPrinter(null); 
  /**
   * 
   * @return true means to roll
   * @return false  means to provide details and call this method again after
   */
  public static boolean readTurn(){
    while (true) {
      Commands command = UserInput.getCommand(actions,"please choose and action");
      switch (command) {
        case detail:
          return false;
        case roll:
          return true;
        case inspect:
          print.inspect(UserInput.getInt("which piece do you wish to  inspect: "));
          break;
        case guide:
          BoardPrinter.guide();
          break;
        case board:
          print.print();
        default:
          break;
      }
    }
  }
}
