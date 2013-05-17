/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public class FrenchWildCard implements Card<FrenchValue> {
    private final FrenchValue value;
    
    /**
     * 
     */
    private FrenchWildCard() {
        value = FrenchValue.WILD;
    }

    @Override
    public FrenchValue getValue() {
        return value;
    }

}
