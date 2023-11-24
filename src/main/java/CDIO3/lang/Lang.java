package CDIO3.lang;

public class Lang {
  private static Language lang = Language.en;
  public static void setLang(Language lang){
    Lang.lang = lang;
  }
  private static String[]
  playerCount = new String[] {"how many players will be in the game? ","DK"},
  arcade = new String[] {"Video game arcade","DK"},//tile
  beach = new String[] {"Beach","DK"},//tile
  bowling = new String[] {"Bowling alley","DK"},
  burger = new String[] {"Burger joint","DK"}, //tile
  candy = new String[] {"Candy store","DK"},//tile
  chance = new String[] {"Chance","DK"},//tile
  goJail = new String[] {"Go to jail","DK"},//tile
  ice = new String[] {"Ice cream parlour", "DK"},//tile
  library = new String[] {"Library","DK"}, //tile
  movie = new String[] {"Movie theatre", "DK"},//tile
  museum = new String[] {"Museum","DK"},//tile
  park = new String[] {"Park place", "DK"},//tile
  parking = new String[] {"Free parking", "DK"},//tile
  pet = new String[] {"Pet store","DK"},//tile
  pizza = new String[] {"Pizza house","DK"},//tile
  skate = new String[] {"Skate park", "DK"},
  start = new String[] {"Start", "DK"},
  swim = new String[] {"Swimming pool","DK"},
  toy = new String[] {"Toy store","DK"},
  visitJail = new String[] {"Visiting in jail","DK"},
  zoo = new String[] {"The zoo","DK"},

  public static String getSring(int ID){
    switch (ID) {
      case 0:
        return playerCount[lang.ordinal()];
      case 1:
        return arcade[lang.ordinal()];
      case 2:
        return beach[lang.ordinal()];
      case 3:
        return bowling[lang.ordinal()];
      case 4:
        return burger[lang.ordinal()];
      case 5:
        return candy[lang.ordinal()];
      case 6:
        return chance[lang.ordinal()];
      case 7:
        return goJail[lang.ordinal()];
      case 8:
        return ice[lang.ordinal()];
      case 9:
        return library[lang.ordinal()];
      case 10:
        return movie[lang.ordinal()];
      case 11:
        return museum[lang.ordinal()];
      case 12:
        return park[lang.ordinal()];
      case 13:
        return parking[lang.ordinal()];
      case 14:
        return pet[lang.ordinal()];
      case 15:
        return pizza[lang.ordinal()];
      case 16:
        return skate[lang.ordinal()];
      case 17:
        return start[lang.ordinal()];
      case 18:
        return swim[lang.ordinal()];
      case 19:
        return toy[lang.ordinal()];
      case 20:
        return visitJail[lang.ordinal()];
      case 21:
        return zoo[lang.ordinal()];
      case 22:
        return pet[lang.ordinal()];
      default:
        return null;
    }
  }
}