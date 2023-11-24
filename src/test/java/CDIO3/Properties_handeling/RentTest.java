package CDIO3.Properties_handeling;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import CDIO3.Tiles.Board;
import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;
import CDIO3.PropertiesHandeling.Buy;
import CDIO3.PropertiesHandeling.payRent;


public class RentTest {
    private static Player[] players;
    private static Board table;
    @Test
    public void Renttest(){
        players = new Player[2];
        for (int i = 0; i < 2 ; i++) {
          players[i] = new Player();
        }

        table = new Board();
        Tile tile = table.getTile(7);
        Tile tile2 = table.getTile(8);

        assertTrue(tile.getPrice() == 2);
        assertTrue(tile2.getPrice() == 2);

        Buy.buytial(tile,players[0],0);
        
        assertTrue(players[1].getWallet().get$() == 20);
        assertTrue(payRent.pay_Rent(tile, players, 1, table));
        assertTrue(players[1].getWallet().get$() == 18);        
        
        assertTrue(payRent.pay_Rent(tile, players, 1, table));
        assertTrue(players[1].getWallet().get$() == 16);  
        
        assertTrue(Buy.buytial(tile2,players[0],0));

        assertTrue(tile.getName() == "Museum");
        assertTrue(tile2.getName() == "Library");

        assertTrue(tile.getOwnedBy() == 0);
        assertTrue(tile2.getOwnedBy() == 0);

        assertTrue(payRent.pay_Rent(tile, players, 1, table));
        assertTrue(players[1].getWallet().get$() == 12);
        assertTrue(payRent.pay_Rent(tile, players, 1, table));
        assertTrue(players[1].getWallet().get$() == 8);
    }

}
