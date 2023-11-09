package CDIO3.TUI;

import java.util.Scanner;

import CDIO3.Tiles.Color;

public class UserInput {
  private static Scanner scan = new Scanner(System.in);
  public static int getInt(String message){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine();
      try{
        return Integer.parseInt(in);
      }catch(NumberFormatException ignore){
        System.out.println("only whole numbers accepted (as numerals)");
      }
    }
  }
  public static Color getColor(String message){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine();
      for (int i = 0; i < Color.values().length; i++) {
        if(Color.values()[i].name().equals(in)){
          return Color.values()[i];
        }
      }
      System.out.println("only these colors are accepted:");
      for (int i = 0; i < Color.values().length; i++) {
        System.out.println("\t" + Color.values()[i].name());
      }
    }
  }
  public static String getCommand(String message, String[] commands){
    return getCommand(message, commands, new String[commands.length]);
  }
    public static String getCommand(String message, String[] commands, String[] actions){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine();
      for (int i = 0; i < commands.length; i++) {
        if(in.equals(commands[i])){
          return commands[i];
        }
      }
      System.out.println("only these commands are accepted:");
      for (int i = 0; i < commands.length; i++) {
        System.out.print("\t" + commands[i]);
        if(actions[i] != null){
          System.out.println("\t" + actions[i]);
        }
      }
    }
  }
}
