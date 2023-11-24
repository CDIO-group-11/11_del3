package CDIO3.Player;

public class Player {
    public static int PlayerAmount;
    Wallet wallet = new Wallet();
    Piece piece = new Piece(0);
    String propertyDeeds;
    int[] tilesowned = new int[24];
    int nrOfTilesOwned = 0;
    

    public int getNrOfTilesOwned() {
        return nrOfTilesOwned;
    }
    public Wallet getWallet() {
        return wallet;
    }
    public Piece getPiece() {
        return piece;
    }
    public String getPropertyDeeds() {
        return propertyDeeds;
    }
    public int[] getTilesOwned() {
        return tilesowned;
    }
    public void setOwnedBy(int newtilesownednr) {
        tilesowned[nrOfTilesOwned] = newtilesownednr;
        nrOfTilesOwned++;
    }
}
