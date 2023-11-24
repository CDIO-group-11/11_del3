package CDIO3.Player;

public class Piece {
    int piece = 0;

    //Get for dice værdi
    public Piece(int initialPosition){
        this.piece = initialPosition;
    }
    public void updatePosition(int[] diceValues) {
        // Sum the values of all dice rolls
        int sum = 0;
        for (int value : diceValues) {
            sum += value;
        }
    }
    //Tilføjer dice værdi til nuværende position og sikre sig det ikke er over 24 (Støresle på board)
    public void move(int sum){
        piece += sum;
        piece %= 24;
    }

    public void setPosition(int newPosition) {
        this.piece = newPosition;
    }

    public int getPosition() {
        return piece;
    }
}
