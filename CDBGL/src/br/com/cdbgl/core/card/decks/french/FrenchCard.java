package br.com.cdbgl.core.card.decks.french;

import br.com.cdbgl.core.card.Card;

/**
 * 
 * @author Lavindar
 *
 */

public class FrenchCard implements Card<FrenchValue> {
    private final FrenchValue value;
    private final FrenchSuit suit;
    
    private FrenchCard(FrenchValue value, FrenchSuit suit){
        this.value = value;
        this.suit = suit;
    }
    
    public static FrenchCard createCard(FrenchValue value, FrenchSuit suit){
        return new FrenchCard(value, suit);
    }
    
    public static FrenchCard createJoker(){
        return createCard(FrenchValue.JOKER, null);
    }
    
    public FrenchSuit getSuit(){
        return suit;
    }

    @Override
    public FrenchValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "FrenchCard " + value + " of " + suit;
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
        FrenchCard other = (FrenchCard) obj;
        if (suit != other.suit)
            return false;
        if (value != other.value)
            return false;
        return true;
    }
}
