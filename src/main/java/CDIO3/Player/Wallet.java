package CDIO3.Player;

public class Wallet {
    
    int $;

    public Wallet() {
        if (Player.PlayerAmount == 4){
            $ = 16;
        } else if (Player.PlayerAmount == 3){
            $ = 18;
        } else {
            $ = 20;
        }
    }
    public int get$() {
        return $;
    }
    public void addMoney(int amount) {
        $ += amount;
    }
}
