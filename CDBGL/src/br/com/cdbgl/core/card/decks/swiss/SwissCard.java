/**
 * 
 */
package br.com.cdbgl.core.card.decks.swiss;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public class SwissCard implements Card<SwissValue> {
    
    private final SwissValue value;
    private final SwissSuit suit;

    private SwissCard(SwissValue value, SwissSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public SwissValue getValue() {
        return value;
    }
    
    public SwissSuit getSuit(){
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
        SwissCard other = (SwissCard) obj;
        if (suit != other.suit)
            return false;
        if (value != other.value)
            return false;
        return true;
    }

    
    
}
