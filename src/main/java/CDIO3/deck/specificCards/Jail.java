package CDIO3.deck.specificCards;

import CDIO3.deck.Card;
import CDIO3.deck.Movementcard;

public class Jail extends Card {
    final int TILE_VALUE = 18;
    final String name = "Jail";

    public Jail() {
        super("Jail", 0, 0, 18, "move");
    }
}
