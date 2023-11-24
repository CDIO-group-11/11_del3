package CDIO3.deck.specificCards;

import CDIO3.deck.Card;
import CDIO3.deck.Moneycard;

public class Paytobank extends Card {
    final int VALUE = -2;
    final String name = "Paytobank";

    public Paytobank() {
        super("Paytobank", -2, 0, 0, "money");
    }

}
