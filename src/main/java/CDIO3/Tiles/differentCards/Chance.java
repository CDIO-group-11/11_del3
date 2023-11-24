package CDIO3.Tiles.differentCards;


import CDIO3.App;
import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.deck.Card;
import CDIO3.deck.Deck;
import CDIO3.deck.Moneycard;
import CDIO3.deck.Movementcard;
import CDIO3.lang.Lang;

public class Chance extends Tile{

    

    public Chance(int tileNR) {
        super(Color.special, Lang.getSring(6), tileNR, 0, -1);
    }

    @Override
    public void landOn(Player[] players, int currentplayer, Board table) {
        Deck deck = new Deck();
        Card card = deck.draw();

        if(card.getType() == "money"){
            if(!Moneycard.moneyAdd(players[currentplayer], card)){
                App.endGame("Not enough money to pay");
            }
        }
        else{
            Movementcard.move(players[currentplayer], card);
        }
    }

}