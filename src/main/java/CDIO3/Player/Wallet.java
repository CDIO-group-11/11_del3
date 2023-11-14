package CDIO3.Player;

public class Wallet {
    
    int w;

    public Wallet() {
        if (Player.Pamount == 4){
            w = 16;
        } else if (Player.Pamount == 3){
            w = 18;
        } else
            w = 20;
    }

}
