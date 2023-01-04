package day02.source;

public class CardGame {
    public static void main(String[] args){
        Deck deck1 = new Deck();
        System.out.printf("... before: %s\n",deck1);
        deck1.shuffle();
        System.out.printf("... after: %s\n",deck1);
    }
}
