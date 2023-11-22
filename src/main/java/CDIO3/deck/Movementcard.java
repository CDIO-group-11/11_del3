package CDIO3.deck;

import CDIO3.Player.Player;

public class Movementcard extends Card {
    private int MOVEMENT_VALUE;

    

    public void move(Player currentPlayer) {
        currentPlayer.getPiece().move(MOVEMENT_VALUE);
    }

    public void onDraw(Player currentPlayer) {
        move(currentPlayer);
    }

}
