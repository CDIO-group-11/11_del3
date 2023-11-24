package CDIO3.Tiles;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BoardTest {
  Board b = new Board();
  @Test
  public void correctTilesEng(){
    String[] correct = new String[]{
      "Go",
      "Burger joint",
      "Pizza house",
      "Chance",
      "Candy store",
      "Ice cream parlour",
      "Visiting in jail",
      "Museum",
      "Library",
      "Chance",
      "Skate park",
      "Swimming pool",
      "Free parking",
      "Video game arcade",
      "Movie theatre",
      "Chance",
      "Toy store",
      "Pet store",
      "Go to jail",
      "Bowling alley",
      "The zoo",
      "Chance",
      "Park place",
      "Boardwalk"
    };
    String[] t = new String[24];
    for (int i = 0; i < t.length; i++) {
      t[i] = b.getTile(i).getName();
    }
    assertArrayEquals(correct, t);
  }
    public void correctTilesDan(){
    String[] correct = new String[]{
      "Start",
      "Burgerbaren",
      "Pizzeriaet",
      "Chance",
      "Slikbutikken",
      "Iskiosken",
      "På besøg i fængsel",
      "Museet",
      "bibliotek",
      "Chance",
      "Skaterparken",
      "Vandlandet",
      "Gratis parkering",
      "Spillehallen",
      "Biografen",
      "Chance",
      "Legetøjsbutikken",
      "Dyrehandel",
      "Gå i fængsel",
      "Bowlinghallen",
      "Zoo",
      "Chance",
      "Swimmingpoolen",
      "Strandpromenaden"
    };
    String[] t = new String[24];
    for (int i = 0; i < t.length; i++) {
      t[i] = b.getTile(i).getName();
    }
    assertArrayEquals(correct, t);
  }
}
