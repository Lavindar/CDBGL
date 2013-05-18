/**
 * 
 */
package br.com.cdbgl.core.card.decks.german;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public class GermanCard implements Card<GermanValue> {
    
    private final GermanValue value;
    private final GermanSuit suit;

    private GermanCard(GermanValue value, GermanSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public GermanValue getValue() {
        return value;
    }
    
    public GermanSuit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return "SwissCard " + value + " of " + suit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GermanCard other = (GermanCard) obj;
        if (suit != other.suit)
            return false;
        if (value != other.value)
            return false;
        return true;
    }

    
    
}
