package CDIO3.TUI;

import java.util.Scanner;

import CDIO3.Tiles.Color;
import CDIO3.lang.Lang;

public class UserInput {
  private static Scanner scan = new Scanner(System.in);
  
  public static int getInt(String message, int min, int max){
    while (true) {
      int in = getInt(message);
      if(in > max) {
        CommandTUI.clearAll();
        System.out.println(Lang.getSring(51) + max);
        continue;
      }
      if(in < min) {
        CommandTUI.clearAll();
        System.out.println(Lang.getSring(52) + min);
        continue;
      }
      return in;
    }
  }
  public static int getInt(String message){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine();
      try{
      CommandTUI.clearAll();
        return Integer.parseInt(in);
      }catch(NumberFormatException ignore){
        CommandTUI.clearAll();
        System.out.println(Lang.getSring(53));
      }
    }
  }
  public static Color getColor(String message){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine();
      for (int i = 0; i < Color.values().length; i++) {
        if(Color.values()[i].name().equals(in)){
      CommandTUI.clearAll();
          return Color.values()[i];
        }
      }
      CommandTUI.clearAll();
      System.out.println(Lang.getSring(54));
      for (int i = 0; i < Color.values().length; i++) {
        System.out.println("\t" + Color.values()[i].name());
      }
    }
  }
  public static Commands getCommand(String message){
    String[] commands = new String[Commands.values().length];
    String[] actions = new String[Commands.values().length];
    for (int i = 0; i < commands.length; i++) {
      commands[i] = Commands.values()[i].name();
      actions [i] = Commands.values()[i].getMessage();
    }
    String in = getCommand(message, commands, actions);
    for (int i = 0; i < Commands.values().length; i++) {
      if(in.toLowerCase().equals(Commands.values()[i].name().toLowerCase())){
        CommandTUI.clearAll();
        return Commands.values()[i];
      }
    }
    return null;
  }
  public static String getCommand(String message, String[] commands){
    return getCommand(message, commands, new String[commands.length]);
  }
  public static String getCommand(String message, String[] commands, String[] actions){
    while (true) {
      System.out.println(message);
      String in = scan.nextLine().toLowerCase();
      for (int i = 0; i < commands.length; i++) {
        if(in.equals(commands[i].toLowerCase())){
          CommandTUI.clearAll();
          return commands[i];
        }
      }
      CommandTUI.clearAll();
      System.out.println(Lang.getSring(55));
      for (int i = 0; i < commands.length; i++) {
        System.out.print("\t" + commands[i]);
        if(i < actions.length && actions[i] != null){
          System.out.println("\t\t" + actions[i]);
        }else{
          System.out.println();
        }
      }
    }
  }
}