package CDIO3.Tiles.differentCards;


import CDIO3.App;
import CDIO3.Player.Player;
import CDIO3.PropertiesHandeling.Buy;
import CDIO3.PropertiesHandeling.needtopayrent;
import CDIO3.PropertiesHandeling.payRent;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Pet extends Tile{

    public Pet(int tileNR) {
        super(Color.yellow, Lang.getSring(14), tileNR, 3, -1);
    }
    
    @Override
    public void landOn(Player[] players, int currentplayer, Board table) {
        if(needtopayrent.NeedtoPayRent(this)){
            if(!payRent.pay_Rent(this, players, currentplayer, table)){
                App.endGame("Not enough money to pay rent!");
            }
        }

       else{
        if(!Buy.buytial(this, players[currentplayer], currentplayer)){
        App.endGame("Not enough money to buy tile!");
        }
    }
    }
}