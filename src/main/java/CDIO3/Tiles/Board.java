package CDIO3.Tiles;

import CDIO3.Tiles.differentCards.Arcade;
import CDIO3.Tiles.differentCards.Bowling;
import CDIO3.Tiles.differentCards.Burger;
import CDIO3.Tiles.differentCards.Candy;
import CDIO3.Tiles.differentCards.Chance;
import CDIO3.Tiles.differentCards.Gjail;
import CDIO3.Tiles.differentCards.Ice;
import CDIO3.Tiles.differentCards.Library;
import CDIO3.Tiles.differentCards.Movie;
import CDIO3.Tiles.differentCards.Museum;
import CDIO3.Tiles.differentCards.Parking;
import CDIO3.Tiles.differentCards.Pet;
import CDIO3.Tiles.differentCards.Pizza;
import CDIO3.Tiles.differentCards.Skate;
import CDIO3.Tiles.differentCards.Start;
import CDIO3.Tiles.differentCards.Swimming;
import CDIO3.Tiles.differentCards.TestTile;
import CDIO3.Tiles.differentCards.Toy;
import CDIO3.Tiles.differentCards.Vjail;
import CDIO3.Tiles.differentCards.Zoo;
import CDIO3.Tiles.differentCards.Park;
import CDIO3.Tiles.differentCards.Beach;

public class Board {
  private Tile[] tiles = new Tile[24];
  public Board(){
    tiles[0]  = new Start(0);
    tiles[1]  = new Burger(1);
    tiles[2]  = new Pizza(2);
    tiles[3]  = new Chance(3);
    tiles[4]  = new Candy(4);
    tiles[5]  = new Ice(5);
    tiles[6]  = new Vjail(6);
    tiles[7]  = new Museum(7);
    tiles[8]  = new Library(8);
    tiles[9]  = new Chance(9);
    tiles[10] = new Skate(10);
    tiles[11] = new Swimming(11);
    tiles[12] = new Parking(12);
    tiles[13] = new Arcade(13);
    tiles[14] = new Movie(14);
    tiles[15] = new Chance(15);
    tiles[16] = new Toy(16);
    tiles[17] = new Pet(17);
    tiles[18] = new Gjail(18);
    tiles[19] = new Bowling(19);
    tiles[20] = new Zoo(20);
    tiles[21] = new Chance(21);
    tiles[22] = new Park(22);
    tiles[23] = new Beach(23);

    for (int i = 0; i < tiles.length; i++) {
      if(tiles[i] == null) 
        tiles[i] = new TestTile(i);
    }
  }
  public Tile getTile(int index){
    return tiles[index];
  }
}
