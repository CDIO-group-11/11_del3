package CDIO3.deck;

import CDIO3.Player.Player;

public class Moneycard extends Card {
    private int VALUE;

    public void moneyAdd(Player currentPlayer, int VALUE){
        currentPlayer.getWallet().addMoney(VALUE);
    }

    public void onDraw(Player currentPlayer){
        moneyAdd(currentPlayer, VALUE);
    }
}
