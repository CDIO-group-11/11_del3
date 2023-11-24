package CDIO3.Deck;

import CDIO3.deck.Deck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;


public class DeckTest {
    Deck deck = new Deck();

    @Test

    public void deckTest(){
        assertEquals(20, deck.length());
    }

    
    
    
}
