package CDIO3.deck.specificCards;

import CDIO3.deck.Card;

public class Lottery extends Card {
    final int VALUE = 5;
    final String name = "Lottery";

    public Lottery(){
        super("Lottery", 5, 0, 0, "money");
    }
}
