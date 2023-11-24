package CDIO3.Properties_handeling;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import CDIO3.Tiles.Board;
import CDIO3.Player.Player;
import CDIO3.Tiles.Tile;
import CDIO3.PropertiesHandeling.Buy;


public class BuyTest {
    private static Board table;
    @Test
    public void Buy_test(){
        Player player1 = new Player();
        table = new Board();
        Tile tile = table.getTile(1);

        Buy.buytial(tile,player1,1);

        assertTrue(player1.getTilesOwned()[0] == 1);
        assertTrue(player1.getWallet().get$() == 19);
    }

}
