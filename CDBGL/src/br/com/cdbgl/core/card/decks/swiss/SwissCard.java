/**
 * 
 */
package br.com.cdbgl.core.card.decks.swiss;

import br.com.cdbgl.core.card.Card;
import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

/**
 * @author Lavindar
 *
 */
public enum SwissCard implements Card<SwissValue, SwissSuit> {
    SIX_OF_BELLS(SwissValue.SIX, SwissSuit.BELLS),
    SEVEN_OF_BELLS(SwissValue.SEVEN, SwissSuit.BELLS),
    EIGHT_OF_BELLS(SwissValue.EIGHT, SwissSuit.BELLS),
    NINE_OF_BELLS(SwissValue.NINE, SwissSuit.BELLS),
    BANNER_OF_BELLS(SwissValue.BANNER, SwissSuit.BELLS),
    UNDER_OF_BELLS(SwissValue.UNDER, SwissSuit.BELLS),
    TOP_OF_BELLS(SwissValue.TOP, SwissSuit.BELLS),
    KING_OF_BELLS(SwissValue.KING, SwissSuit.BELLS),
    ACE_OF_BELLS(SwissValue.ACE, SwissSuit.BELLS),
    SIX_OF_SHIELDS(SwissValue.SIX, SwissSuit.SHIELDS),
    SEVEN_OF_SHIELDS(SwissValue.SEVEN, SwissSuit.SHIELDS),
    EIGHT_OF_SHIELDS(SwissValue.EIGHT, SwissSuit.SHIELDS),
    NINE_OF_SHIELDS(SwissValue.NINE, SwissSuit.SHIELDS),
    BANNER_OF_SHIELDS(SwissValue.BANNER, SwissSuit.SHIELDS),
    UNDER_OF_SHIELDS(SwissValue.UNDER, SwissSuit.SHIELDS),
    TOP_OF_SHIELDS(SwissValue.TOP, SwissSuit.SHIELDS),
    KING_OF_SHIELDS(SwissValue.KING, SwissSuit.SHIELDS),
    ACE_OF_SHIELDS(SwissValue.ACE, SwissSuit.SHIELDS),
    SIX_OF_ROSES(SwissValue.SIX, SwissSuit.ROSES),
    SEVEN_OF_ROSES(SwissValue.SEVEN, SwissSuit.ROSES),
    EIGHT_OF_ROSES(SwissValue.EIGHT, SwissSuit.ROSES),
    NINE_OF_ROSES(SwissValue.NINE, SwissSuit.ROSES),
    BANNER_OF_ROSES(SwissValue.BANNER, SwissSuit.ROSES),
    UNDER_OF_ROSES(SwissValue.UNDER, SwissSuit.ROSES),
    TOP_OF_ROSES(SwissValue.TOP, SwissSuit.ROSES),
    KING_OF_ROSES(SwissValue.KING, SwissSuit.ROSES),
    ACE_OF_ROSES(SwissValue.ACE, SwissSuit.ROSES),
    SIX_OF_ACORNS(SwissValue.SIX, SwissSuit.ACORNS),
    SEVEN_OF_ACORNS(SwissValue.SEVEN, SwissSuit.ACORNS),
    EIGHT_OF_ACORNS(SwissValue.EIGHT, SwissSuit.ACORNS),
    NINE_OF_ACORNS(SwissValue.NINE, SwissSuit.ACORNS),
    BANNER_OF_ACORNS(SwissValue.BANNER, SwissSuit.ACORNS),
    UNDER_OF_ACORNS(SwissValue.UNDER, SwissSuit.ACORNS),
    TOP_OF_ACORNS(SwissValue.TOP, SwissSuit.ACORNS),
    KING_OF_ACORNS(SwissValue.KING, SwissSuit.ACORNS),
    ACE_OF_ACORNS(SwissValue.ACE, SwissSuit.ACORNS);
    
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
    
    @Override
    public SwissSuit getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        String r = NameProvider.getName(PropertiesEnum.CARD_SWISS_SEPARATOR.getKey());
        
        r = r.replaceAll("\\[VALUE\\]", value.getName());
        r = r.replaceAll("\\[SUIT\\]", suit.getName());
        
        return r;
    }    
}
