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
import java.util.*;

public class PlayingCard implements Comparable{
    
    private Suit suit;
    private Rank rank;
    

    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    
    
  public int compareTo(Object o){
    if(this == o)
          return 0;
    PlayingCard p = (PlayingCard) o;
    if(suit.compareTo(p.getSuit()) != 0)
            return suit.compareTo(p.getSuit());
    return rank.compareTo(p.getRank());
  }  

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
  
  
}
