/**
 * 
 */
package br.com.cdbgl.core.card.decks.spanish;

import br.com.cdbgl.core.card.Card;

/**
 * @author Lavindar
 *
 */
public enum SpanishCard implements Card<SpanishValue, SpanishSuit> {
    ONE_OF_CLUBS(SpanishValue.ONE, SpanishSuit.CLUBS),
    TWO_OF_CLUBS(SpanishValue.TWO, SpanishSuit.CLUBS),
    THREE_OF_CLUBS(SpanishValue.THREE, SpanishSuit.CLUBS),
    FOUR_OF_CLUBS(SpanishValue.FOUR, SpanishSuit.CLUBS),
    FIVE_OF_CLUBS(SpanishValue.FIVE, SpanishSuit.CLUBS),
    SIX_OF_CLUBS(SpanishValue.SIX, SpanishSuit.CLUBS),
    SEVEN_OF_CLUBS(SpanishValue.SEVEN, SpanishSuit.CLUBS),
    EIGHT_OF_CLUBS(SpanishValue.EIGHT, SpanishSuit.CLUBS),
    NINE_OF_CLUBS(SpanishValue.NINE, SpanishSuit.CLUBS),
    KNAVE_OF_CLUBS(SpanishValue.KNAVE, SpanishSuit.CLUBS),
    KNIGHT_OF_CLUBS(SpanishValue.KNIGHT, SpanishSuit.CLUBS),
    KING_OF_CLUBS(SpanishValue.KING, SpanishSuit.CLUBS),
    ONE_OF_CUPS(SpanishValue.ONE, SpanishSuit.CUPS),
    TWO_OF_CUPS(SpanishValue.TWO, SpanishSuit.CUPS),
    THREE_OF_CUPS(SpanishValue.THREE, SpanishSuit.CUPS),
    FOUR_OF_CUPS(SpanishValue.FOUR, SpanishSuit.CUPS),
    FIVE_OF_CUPS(SpanishValue.FIVE, SpanishSuit.CUPS),
    SIX_OF_CUPS(SpanishValue.SIX, SpanishSuit.CUPS),
    SEVEN_OF_CUPS(SpanishValue.SEVEN, SpanishSuit.CUPS),
    EIGHT_OF_CUPS(SpanishValue.EIGHT, SpanishSuit.CUPS),
    NINE_OF_CUPS(SpanishValue.NINE, SpanishSuit.CUPS),
    KNAVE_OF_CUPS(SpanishValue.KNAVE, SpanishSuit.CUPS),
    KNIGHT_OF_CUPS(SpanishValue.KNIGHT, SpanishSuit.CUPS),
    KING_OF_CUPS(SpanishValue.KING, SpanishSuit.CUPS),
    ONE_OF_SWORDS(SpanishValue.ONE, SpanishSuit.SWORDS),
    TWO_OF_SWORDS(SpanishValue.TWO, SpanishSuit.SWORDS),
    THREE_OF_SWORDS(SpanishValue.THREE, SpanishSuit.SWORDS),
    FOUR_OF_SWORDS(SpanishValue.FOUR, SpanishSuit.SWORDS),
    FIVE_OF_SWORDS(SpanishValue.FIVE, SpanishSuit.SWORDS),
    SIX_OF_SWORDS(SpanishValue.SIX, SpanishSuit.SWORDS),
    SEVEN_OF_SWORDS(SpanishValue.SEVEN, SpanishSuit.SWORDS),
    EIGHT_OF_SWORDS(SpanishValue.EIGHT, SpanishSuit.SWORDS),
    NINE_OF_SWORDS(SpanishValue.NINE, SpanishSuit.SWORDS),
    KNAVE_OF_SWORDS(SpanishValue.KNAVE, SpanishSuit.SWORDS),
    KNIGHT_OF_SWORDS(SpanishValue.KNIGHT, SpanishSuit.SWORDS),
    KING_OF_SWORDS(SpanishValue.KING, SpanishSuit.SWORDS),
    ONE_OF_GOLDS(SpanishValue.ONE, SpanishSuit.GOLDS),
    TWO_OF_GOLDS(SpanishValue.TWO, SpanishSuit.GOLDS),
    THREE_OF_GOLDS(SpanishValue.THREE, SpanishSuit.GOLDS),
    FOUR_OF_GOLDS(SpanishValue.FOUR, SpanishSuit.GOLDS),
    FIVE_OF_GOLDS(SpanishValue.FIVE, SpanishSuit.GOLDS),
    SIX_OF_GOLDS(SpanishValue.SIX, SpanishSuit.GOLDS),
    SEVEN_OF_GOLDS(SpanishValue.SEVEN, SpanishSuit.GOLDS),
    EIGHT_OF_GOLDS(SpanishValue.EIGHT, SpanishSuit.GOLDS),
    NINE_OF_GOLDS(SpanishValue.NINE, SpanishSuit.GOLDS),
    KNAVE_OF_GOLDS(SpanishValue.KNAVE, SpanishSuit.GOLDS),
    KNIGHT_OF_GOLDS(SpanishValue.KNIGHT, SpanishSuit.GOLDS),
    KING_OF_GOLDS(SpanishValue.KING, SpanishSuit.GOLDS);
    
    private final SpanishValue value;
    private final SpanishSuit suit; 
    
    private SpanishCard(SpanishValue value, SpanishSuit suit) {
        this.value = value;
        this.suit = suit;
    }    

    @Override
    public SpanishValue getValue() {
        return value;
    }
    
    @Override
    public SpanishSuit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}