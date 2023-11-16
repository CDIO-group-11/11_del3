package CDIO3.TUI;

public class TUI_Manager {
  private final static String [] actions = new String[]{"se information about all players","roll for this turn"};
  private static BoardPrinter print = new BoardPrinter(null); 
  /**
   * reads a user input and shows the user the requested information to the user
   * @return on roll command, when the  user rolls
   */
  public static void readTurn(String details){
    while (true) {
      Commands command = UserInput.getCommand(actions,"please choose and action");
      switch (command) {
        case detail:
          System.out.println("details");;
        case roll:
          return;
        case inspect:
          print.inspect(UserInput.getInt("which piece do you wish to inspect: "));
          break;
        case guide:
          BoardPrinter.guide();
          break;
        case board:
          print.print();
          break;
      }
    }
  }
}
