package day02.source;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deckList;
    //Constructor - generate a full deck
    public Deck(){
        this.deckList = new LinkedList<>();
        new LinkedList<>();
        for (int i=0;i<Constants.SUIT.length;i++){
        String suit = Constants.SUIT[i];
            for (int j=0;j<Constants.RANK.length;j++){
                String rank = Constants.RANK[j];
                Integer value = Constants.VALUE[j];
                Card card = new Card(suit,rank,value);
                deckList.add(card);
            }
        }
    //System.out.println("The new deck: ");
    //System.out.println(deckList);
    }
    //Shuffle
    public void shuffle(){
        Random rand = new SecureRandom();
        for (int k=0;k<deckList.size();k++){
            int index = rand.nextInt(deckList.size());
            Card ori = deckList.get(k);
            deckList.set(k,deckList.get(index));
            deckList.set(index,ori); 
        }
    }
    @Override
    public String toString(){
        return "Deck [deck= "+ deckList +"]\n";
    }

    //Deal a card from the top
    public Card deal(){
        Card cardOut = this.deckList.remove(deckList.size());
        return cardOut;
    }
}
