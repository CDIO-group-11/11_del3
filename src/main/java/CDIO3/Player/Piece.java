package CDIO3.Player;

import CDIO1.RaffleCup;

public class Piece {
    int piece = 0;
    
    //Get for dice værdi
    public void getdice() {
        RaffleCup raffleCup = new RaffleCup();
        int diceValue = raffleCup.roll();

    //Tilføjer dice værdi til nuværende position og sikre sig det ikke er over 24 (Støresle på board)
    public void move(int diceValue){
        piece += diceValue;
        piece %= 25;
    }

    //

}
