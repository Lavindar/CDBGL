/**
 * 
 */
package br.com.cdbgl.core.card.decks.spanish;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public class SpanishCard implements Card<SpanishValue> {
    private final SpanishValue value;
    private final SpanishSuit suit; 
    
    private SpanishCard(SpanishValue value, SpanishSuit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public static SpanishCard createCard(SpanishValue value, SpanishSuit suit){
        return new SpanishCard(value, suit);
    }
    
    @Override
    public SpanishValue getValue() {
        return value;
    }
    
    public SpanishSuit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return "SpanishCard " + value + " of " + suit;
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
        SpanishCard other = (SpanishCard) obj;
        if (suit != other.suit)
            return false;
        if (value != other.value)
            return false;
        return true;
    }
}
