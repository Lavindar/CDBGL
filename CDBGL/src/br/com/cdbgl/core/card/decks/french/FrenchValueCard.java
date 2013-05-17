/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public class FrenchValueCard implements Card<FrenchValue> {
    private final FrenchValue value;
    private final FrenchSuit suit;
    
    /**
     * @param value
     * @param suit
     */
    private FrenchValueCard(FrenchValue value, FrenchSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public FrenchValue getValue() {
        return value;
    }
    
    public FrenchSuit getSuit(){
        return suit;
    }

}
