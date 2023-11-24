package CDIO3.deck;

public abstract class Card{
    protected String name;
    protected int VALUE;
    protected int MOVEMENT_VALUE;
    protected int TILE_VALUE;
    protected String type;

    public Card(String name, int VALUE, int MOVEMENT_VALUE,int TILE_VALUE, String type) {
        this.name = name;
        this.VALUE = VALUE;
        this.MOVEMENT_VALUE = MOVEMENT_VALUE;
        this.TILE_VALUE = TILE_VALUE;  
    }

    public String getName() {
        return name;
    }

    public int getVALUE() {
        return VALUE;
    }

    public int getMOVEMENT_VALUE() {
        return MOVEMENT_VALUE;
    }

    public int getTILE_VALUE() {
        return TILE_VALUE;
    }

    public String getType(){
        return type;
    }

    
}