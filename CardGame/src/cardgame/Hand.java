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
public class Hand {
    
    public final static int MAX_SIZE = 5;
    PlayingCard[] playingcards = new PlayingCard[MAX_SIZE];
    public int size = 0;
   
    

    public static int getMAX_SIZE() {
        return MAX_SIZE;
    }
    
    public void addCard(PlayingCard p){
        
        if(size > MAX_SIZE)
            throw new IndexOutOfBoundsException("Exceeded number of cards!");
        
        for(int i =0 ; i< size ;i++)
           if( p.compareTo(playingcards[i]) == 0)
               throw new DuplicateCardException("Card already exists!");
        
        playingcards[size++] = p;
    }

    public int getSize() {
        return size;
    }
   
    public Hand() {
    }
    
 
  
    
}