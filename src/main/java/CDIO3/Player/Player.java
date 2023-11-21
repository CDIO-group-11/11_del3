package CDIO3.Player;

public class Player {
    public static int Pamount;
    Wallet wallet = new Wallet();
    int piece;
    String propertyDeeds;
    int[] tilesowned;

    public Wallet getWallet() {
        return wallet;
    }
    public int getPiece() {
        return piece;
    }
    public String getPropertyDeeds() {
        return propertyDeeds;
    }
    public int[] getTilesOwned() {
        return tilesowned;
    }
    public void setOwnedBy(int newtilesownednr) {
        tilesowned[tilesowned.length + 1] = newtilesownednr;
    }
}
