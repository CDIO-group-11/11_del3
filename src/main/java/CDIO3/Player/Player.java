package CDIO3.Player;

public class Player {
    public static int PlayerAmount;
    Wallet wallet = new Wallet();
    Piece piece;
    String propertyDeeds;
    int[] tilesowned = new int[24];
    int nrOfTilesOwned = 0;
    
    //Giver spillerens penge
    public Wallet getWallet() {
        return wallet;
    }
    //Giver spillerens position på brættet
    public Piece getPiece() {
        return piece;
    }
    //Giver de ejendomme spilleren ejer
    public int[] getTilesOwned() {
        return tilesowned;
    }
    //Hjælper med at sætte en ejendom som eget af spilleren
    public void setOwnedBy(int newtilesownednr) {
        tilesowned[nrOfTilesOwned] = newtilesownednr;
        nrOfTilesOwned++;
    }
}
