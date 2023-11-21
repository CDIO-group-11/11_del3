package CDIO3.Player;

public class Player {
    public static int PlayerAmount;
    Wallet wallet = new Wallet();
    int piece;
    String propertyDeeds;

    public Wallet getWallet() {
        return wallet;
    }
    public Piece getPiece() {
        return piece;
    }
    public String getPropertyDeeds() {
        return propertyDeeds;
    }

}
