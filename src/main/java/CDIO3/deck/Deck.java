package CDIO3.deck;

import CDIO3.deck.specificCards.*;

public class Deck {
    private Card[] deck = new Card[20];

    public Deck() {
        deck = new Card[]{
            new Bank(), new Jail(), new Lottery(), new Move2(), new Moveback(), 
            new Parking(), new Paytobank(), new Start(), new Bank(), new Bank(), 
            new Lottery(), new Move2(), new Paytobank(), new Moveback(), new Move2(),
            new Bank(), new Lottery(), new Move2(), new Parking(), new Start()
        };
        shuffle();
    }
    private void shuffle(){
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < deck.length; j++) {
                int index = (int) (Math.random() * deck.length);
                Card temp = deck[index];
                deck[index] = deck[j];
                deck[j] = temp;
            }
        }
    }
}
