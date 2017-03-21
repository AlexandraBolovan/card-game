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
import java.util.concurrent.ThreadLocalRandom;

public class Deck { //all cards method , sort method , shuffle 
    
    private PlayingCard[] cards = new PlayingCard[52];
    private int noCards;

    public Deck() {
      for(Suit s: Suit.values())
          for(Rank r: Rank.values())
        cards[noCards++] =  new  PlayingCard(s,r);     
    }
   public void sort (){
       PlayingCard aux;
       for(int i=0;i<cards.length-1;i++)
          for(int j=0;j<cards.length;j++)
              if(cards[i].compareTo(cards[j]) > 0)
              {aux = cards[i];
              cards[i]=cards[j];
              cards[j]=aux;  
              }
   }
   public void shuffle(){
      Random random = ThreadLocalRandom.current();
      for(int i=cards.length-1;i>0 ;i--)
      {
          int j = random.nextInt(i+1);
          PlayingCard card = cards[j];
          cards[j]=cards[i];
          cards[i] = card;
      }
   }
   
    public PlayingCard getPlayingCard(){ // to be checked
       Random random = ThreadLocalRandom.current();
       int j = random.nextInt(52+1);
      return cards[j];
        
    }   
  
   public void toStringg(){
       for(int i =0;i<cards.length;i++)
           cards[i].toString();
   }
    
}
