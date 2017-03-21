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
public class DuplicateCardException extends RuntimeException{

    public DuplicateCardException() {
    }

    public DuplicateCardException(String message) {
        super(message);
    }
    
    
    
}
