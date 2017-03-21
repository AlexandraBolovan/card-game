/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author admin
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       PlayingCard c1 = new PlayingCard(Suit.DIAMONDS,Rank.KNIGHT);
       PlayingCard c2 = new PlayingCard(Suit.CLUBS,Rank.THREE);
       PlayingCard c3 = new PlayingCard(Suit.CLUBS,Rank.KNIGHT);
       PlayingCard c4 = new PlayingCard(Suit.HEARTS,Rank.QUEEN);
       PlayingCard c5 = new PlayingCard(Suit.SPADES,Rank.ACE);
       Hand hand = new Hand();
       
      
       
       hand.addCard(c1);
       hand.addCard(c2);
       hand.addCard(c3);
       hand.addCard(c4);
       hand.addCard(c5);
       
       //hand.addCard(c2); //line 34 should throw exception
       
       Deck deck1 = new Deck();
       deck1.shuffle();
       deck1.sort();
       
       
       
    }
    

}