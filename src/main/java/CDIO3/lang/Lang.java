package CDIO3.lang;

public class Lang {
  private static Language lang = Language.en;
  public static void setLang(){

  }
  private static String[]
  playerCount = new String[] {"how many players will be in the game? ","DK"};

  public static String getSring(int ID){
    switch (ID) {
      case 0:
        return playerCount[lang.ordinal()];
      case 1:
        return playerCount[lang.ordinal()];
      case 2:
        return playerCount[lang.ordinal()];
      case 3:
        return playerCount[lang.ordinal()];
      case 4:
        return playerCount[lang.ordinal()];
      case 5:
        return playerCount[lang.ordinal()];
      default:
        return null;
    }
  }
}