package bks;

public class Game {
    private String name;// can only be accessed by this game class
    public void setName(String aName){
        this.name = aName;
    }
    public String getName(){
        return this.name;
    }
}
