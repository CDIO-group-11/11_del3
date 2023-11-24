package CDIO3.lang;

public class Lang {
  private static Language lang = Language.en;
  public static void setLang(Language lang){
    Lang.lang = lang;
  }
  private static String[]


  playerCount = new String[] {"how many players will be in the game? ","Hvor mange spillere spiller med? "},
  arcade = new String[] {"Video game arcade","Spillehallen"},//tile
  beach = new String[] {"Beach","Strandpromenaden"},
  bowling = new String[] {"Bowling alley","Bowlinghallen"},
  burger = new String[] {"Burger joint","Burgerbaren"}, //tile
  candy = new String[] {"Candy store","Slikbutikken"},//tile
  chance = new String[] {"Chance","Chance"},//tile
  goJail = new String[] {"Go to jail","Gå i fængsel"},//tile
  ice = new String[] {"Ice cream parlour", "Iskiosken"},//tile
  library = new String[] {"Library","bibliotek"}, //tile
  movie = new String[] {"Movie theatre", "Biografen"},//tile
  museum = new String[] {"Museum","Museet"},//tile
  park = new String[] {"Park place", "Swimmingpoolen"},//tile
  parking = new String[] {"Free parking", "Gratis parkering"},//tile
  pet = new String[] {"Pet store","Dyrehandel"},//tile
  pizza = new String[] {"Pizza house","Pizzeriaet"},//tile
  skate = new String[] {"Skate park", "Skaterparken"},
  start = new String[] {"Start", "Start"},
  swim = new String[] {"Swimming pool","Vandlandet"},
  toy = new String[] {"Toy store","Legetøjsbutikken"},
  visitJail = new String[] {"Visiting in jail","På besøg i fængsel"},
  zoo = new String[] {"The zoo","Zoo"},
  descriptCol = new String[] {"│████color█████│" ,"│████Farve█████│"},//length is constant
  descriptOwn = new String[] {"│owner│#tile nr│" ,"│Ejer │#Felt nr│"},//length is constant
  detail = new String[] {"see information about all players","Se information omkring alle spillere"},
  roll = new String[] {"roll for this turn","Rul for denne tur"},
  inspect = new String[] {"take a closer look at a tile","Tag et næmmere kig på et felt"},
  guide = new String[] {"learn how to read a tile","Lær at læse informationen på et felt"},
  board = new String[] {"see the entire board","Se brættet"},
  ownerList = new String[] {"see what tiles all players own","Se alle spilleres felter"},
  line = new String[] {"Missing line","Mangler linje"},
  name = new String[] {"tile name: ","Navn på felt: "},
  nr = new String[] {"tile nr: ", "Felt nr: "},
  color = new String[] {"tile color: ", "Felt farve: "},

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
        return descriptCol[lang.ordinal()];
      case 23:
        return descriptOwn[lang.ordinal()];
      case 24:
        return detail[lang.ordinal()];
      case 25:
        return roll[lang.ordinal()];
      case 26:
        return inspect[lang.ordinal()];
      case 27:
        return guide[lang.ordinal()];
      case 28:
        return board[lang.ordinal()];
      case 29:
        return ownerList[lang.ordinal()];
      case 30:
        return line[lang.ordinal()];
      case 31:
        return name[lang.ordinal()];
      case 32:
        return nr[lang.ordinal()];
      case 33:
        return color[lang.ordinal()];
      case 34:
        return null[lang.ordinal()];
      case 35:
        return null[lang.ordinal()];
      case 36:
        return null[lang.ordinal()];
        default:
        return null;
    }
  }
}