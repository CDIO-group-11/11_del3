package CDIO3.deck;

import CDIO3.Player.Player;

public class Moneycard{


    public static boolean moneyAdd(Player player, Card card){
        if(card.getVALUE() < 0) {
            if(player.getWallet().get$() >= card.getVALUE()){
                player.getWallet().addMoney(card.getVALUE());
                return true;
        }
        return false;
    }
        else {
            player.getWallet().addMoney(card.getVALUE());
            return true;
        }
    }
}