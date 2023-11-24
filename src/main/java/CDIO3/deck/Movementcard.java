package CDIO3.deck;

import CDIO3.Player.Player;

public class Movementcard {

    public void move(Player player, Card card) {
        if(card.getMOVEMENT_VALUE() != 0) {
            player.getPiece().move(card.getMOVEMENT_VALUE());

        }
        else {
            player.getPiece().setPosition(card.getTILE_VALUE());
        }
    }
}
