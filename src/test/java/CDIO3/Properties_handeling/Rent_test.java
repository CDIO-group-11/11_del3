package CDIO3.Properties_handeling;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import CDIO3.Tiles.Board;
import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;
import CDIO3.PropertiesHandeling.Buy;
import CDIO3.PropertiesHandeling.payRent;


public class Rent_test {
    private static Player[] players;
    private static Board table;
    @Test
    public void Rent_test(){
        players = new Player[2];
        for (int i = 0; i < 2 ; i++) {
          players[i] = new Player();
        }

        table = new Board();
        Tile tile = table.getTile(1);
        Tile tile2 = table.getTile(2);

        Buy.buytial(tile,players[0],1);

        assertTrue(payRent.pay_Rent(tile, players, 1));
        assertFalse(payRent.pay_Rent(tile2, players, 1));
    }

}
