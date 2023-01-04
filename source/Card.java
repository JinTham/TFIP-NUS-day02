package day02.source;

public class Card {
    private String suit;
    private String rank;
    private Integer value;

    //Constructor
    public Card(String suit, String rank, Integer value){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    //Getter
    @Override
    public String toString(){
        return "Card{rank=%s,suit=%s,value=%d}".formatted(this.rank,this.suit,this.value);
    }
}
