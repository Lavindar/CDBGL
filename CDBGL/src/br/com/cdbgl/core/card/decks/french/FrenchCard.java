/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public enum FrenchCard implements Card<FrenchValue, FrenchSuit> {
    JOKER(FrenchValue.JOKER, null),
    ACE_OF_SPADES(FrenchValue.ACE, FrenchSuit.SPADES),
    TWO_OF_SPADES(FrenchValue.TWO, FrenchSuit.SPADES),
    TRHEE_OF_SPADES(FrenchValue.TRHEE, FrenchSuit.SPADES),
    FOUR_OF_SPADES(FrenchValue.FOUR, FrenchSuit.SPADES),
    FIVE_OF_SPADES(FrenchValue.FIVE, FrenchSuit.SPADES),
    SIX_OF_SPADES(FrenchValue.SIX, FrenchSuit.SPADES),
    SEVEN_OF_SPADES(FrenchValue.SEVEN, FrenchSuit.SPADES),
    EIGHT_OF_SPADES(FrenchValue.EIGHT, FrenchSuit.SPADES),
    NINE_OF_SPADES(FrenchValue.NINE, FrenchSuit.SPADES),
    TEN_OF_SPADES(FrenchValue.TEN, FrenchSuit.SPADES),
    JACK_OF_SPADES(FrenchValue.JACK, FrenchSuit.SPADES),
    QUEEN_OF_SPADES(FrenchValue.QUEEN, FrenchSuit.SPADES),
    KING_OF_SPADES(FrenchValue.KING, FrenchSuit.SPADES),
    ACE_OF_HEARTS(FrenchValue.ACE, FrenchSuit.HEARTS),
    TWO_OF_HEARTS(FrenchValue.TWO, FrenchSuit.HEARTS),
    TRHEE_OF_HEARTS(FrenchValue.TRHEE, FrenchSuit.HEARTS),
    FOUR_OF_HEARTS(FrenchValue.FOUR, FrenchSuit.HEARTS),
    FIVE_OF_HEARTS(FrenchValue.FIVE, FrenchSuit.HEARTS),
    SIX_OF_HEARTS(FrenchValue.SIX, FrenchSuit.HEARTS),
    SEVEN_OF_HEARTS(FrenchValue.SEVEN, FrenchSuit.HEARTS),
    EIGHT_OF_HEARTS(FrenchValue.EIGHT, FrenchSuit.HEARTS),
    NINE_OF_HEARTS(FrenchValue.NINE, FrenchSuit.HEARTS),
    TEN_OF_HEARTS(FrenchValue.TEN, FrenchSuit.HEARTS),
    JACK_OF_HEARTS(FrenchValue.JACK, FrenchSuit.HEARTS),
    QUEEN_OF_HEARTS(FrenchValue.QUEEN, FrenchSuit.HEARTS),
    KING_OF_HEARTS(FrenchValue.KING, FrenchSuit.HEARTS),
    ACE_OF_DIAMONDS(FrenchValue.ACE, FrenchSuit.DIAMONDS),
    TWO_OF_DIAMONDS(FrenchValue.TWO, FrenchSuit.DIAMONDS),
    TRHEE_OF_DIAMONDS(FrenchValue.TRHEE, FrenchSuit.DIAMONDS),
    FOUR_OF_DIAMONDS(FrenchValue.FOUR, FrenchSuit.DIAMONDS),
    FIVE_OF_DIAMONDS(FrenchValue.FIVE, FrenchSuit.DIAMONDS),
    SIX_OF_DIAMONDS(FrenchValue.SIX, FrenchSuit.DIAMONDS),
    SEVEN_OF_DIAMONDS(FrenchValue.SEVEN, FrenchSuit.DIAMONDS),
    EIGHT_OF_DIAMONDS(FrenchValue.EIGHT, FrenchSuit.DIAMONDS),
    NINE_OF_DIAMONDS(FrenchValue.NINE, FrenchSuit.DIAMONDS),
    TEN_OF_DIAMONDS(FrenchValue.TEN, FrenchSuit.DIAMONDS),
    JACK_OF_DIAMONDS(FrenchValue.JACK, FrenchSuit.DIAMONDS),
    QUEEN_OF_DIAMONDS(FrenchValue.QUEEN, FrenchSuit.DIAMONDS),
    KING_OF_DIAMONDS(FrenchValue.KING, FrenchSuit.DIAMONDS),
    ACE_OF_CLUBS(FrenchValue.ACE, FrenchSuit.CLUBS),
    TWO_OF_CLUBS(FrenchValue.TWO, FrenchSuit.CLUBS),
    TRHEE_OF_CLUBS(FrenchValue.TRHEE, FrenchSuit.CLUBS),
    FOUR_OF_CLUBS(FrenchValue.FOUR, FrenchSuit.CLUBS),
    FIVE_OF_CLUBS(FrenchValue.FIVE, FrenchSuit.CLUBS),
    SIX_OF_CLUBS(FrenchValue.SIX, FrenchSuit.CLUBS),
    SEVEN_OF_CLUBS(FrenchValue.SEVEN, FrenchSuit.CLUBS),
    EIGHT_OF_CLUBS(FrenchValue.EIGHT, FrenchSuit.CLUBS),
    NINE_OF_CLUBS(FrenchValue.NINE, FrenchSuit.CLUBS),
    TEN_OF_CLUBS(FrenchValue.TEN, FrenchSuit.CLUBS),
    JACK_OF_CLUBS(FrenchValue.JACK, FrenchSuit.CLUBS),
    QUEEN_OF_CLUBS(FrenchValue.QUEEN, FrenchSuit.CLUBS),
    KING_OF_CLUBS(FrenchValue.KING, FrenchSuit.CLUBS);
    
    private final FrenchValue value;
    private final FrenchSuit suit;
    
    private FrenchCard(FrenchValue value, FrenchSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public FrenchValue getValue() {
        return value;
    }

    @Override
    public FrenchSuit getSuit() {
        return suit;
    }
    
    @Override
    public String toString(){
        if(suit != null){
            return value + " of " + suit;
        } else {
            return value.toString();
        }
    }

}
