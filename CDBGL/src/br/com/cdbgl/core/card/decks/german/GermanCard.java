/**
 * 
 */
package br.com.cdbgl.core.card.decks.german;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public enum GermanCard implements Card<GermanValue, GermanSuit> {
    SIX_OF_HEARTS(GermanValue.SIX, GermanSuit.HEARTS),
    SEVEN_OF_HEARTS(GermanValue.SEVEN, GermanSuit.HEARTS),
    EIGHT_OF_HEARTS(GermanValue.EIGHT, GermanSuit.HEARTS),
    NINE_OF_HEARTS(GermanValue.NINE, GermanSuit.HEARTS),
    TEN_OF_HEARTS(GermanValue.TEN, GermanSuit.HEARTS),
    JACK_OF_HEARTS(GermanValue.JACK, GermanSuit.HEARTS),
    QUEEN_OF_HEARTS(GermanValue.QUEEN, GermanSuit.HEARTS),
    KING_OF_HEARTS(GermanValue.KING, GermanSuit.HEARTS),
    ACE_OF_HEARTS(GermanValue.ACE, GermanSuit.HEARTS),
    SIX_OF_DIAMONDS(GermanValue.SIX, GermanSuit.DIAMONDS),
    SEVEN_OF_DIAMONDS(GermanValue.SEVEN, GermanSuit.DIAMONDS),
    EIGHT_OF_DIAMONDS(GermanValue.EIGHT, GermanSuit.DIAMONDS),
    NINE_OF_DIAMONDS(GermanValue.NINE, GermanSuit.DIAMONDS),
    TEN_OF_DIAMONDS(GermanValue.TEN, GermanSuit.DIAMONDS),
    JACK_OF_DIAMONDS(GermanValue.JACK, GermanSuit.DIAMONDS),
    QUEEN_OF_DIAMONDS(GermanValue.QUEEN, GermanSuit.DIAMONDS),
    KING_OF_DIAMONDS(GermanValue.KING, GermanSuit.DIAMONDS),
    ACE_OF_DIAMONDS(GermanValue.ACE, GermanSuit.DIAMONDS),
    SIX_OF_SPADES(GermanValue.SIX, GermanSuit.SPADES),
    SEVEN_OF_SPADES(GermanValue.SEVEN, GermanSuit.SPADES),
    EIGHT_OF_SPADES(GermanValue.EIGHT, GermanSuit.SPADES),
    NINE_OF_SPADES(GermanValue.NINE, GermanSuit.SPADES),
    TEN_OF_SPADES(GermanValue.TEN, GermanSuit.SPADES),
    JACK_OF_SPADES(GermanValue.JACK, GermanSuit.SPADES),
    QUEEN_OF_SPADES(GermanValue.QUEEN, GermanSuit.SPADES),
    KING_OF_SPADES(GermanValue.KING, GermanSuit.SPADES),
    ACE_OF_SPADES(GermanValue.ACE, GermanSuit.SPADES),
    SIX_OF_CLUBS(GermanValue.SIX, GermanSuit.CLUBS),
    SEVEN_OF_CLUBS(GermanValue.SEVEN, GermanSuit.CLUBS),
    EIGHT_OF_CLUBS(GermanValue.EIGHT, GermanSuit.CLUBS),
    NINE_OF_CLUBS(GermanValue.NINE, GermanSuit.CLUBS),
    TEN_OF_CLUBS(GermanValue.TEN, GermanSuit.CLUBS),
    JACK_OF_CLUBS(GermanValue.JACK, GermanSuit.CLUBS),
    QUEEN_OF_CLUBS(GermanValue.QUEEN, GermanSuit.CLUBS),
    KING_OF_CLUBS(GermanValue.KING, GermanSuit.CLUBS),
    ACE_OF_CLUBS(GermanValue.ACE, GermanSuit.CLUBS);
    
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
    
    @Override
    public GermanSuit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
