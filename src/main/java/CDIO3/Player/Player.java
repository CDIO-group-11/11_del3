package CDIO3.Player;

public class Player {
    public static int Pamount;
    Wallet wallet = new Wallet();
    Piece piece;
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
