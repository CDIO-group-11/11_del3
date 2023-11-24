package CDIO3.deck;

import CDIO3.Player.Player;

public class Movementcard {

    public static void move(Player player, Card card) {
        player.getPiece().move(card.getMOVEMENT_VALUE());
    }
}
