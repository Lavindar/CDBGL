/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

/**
 * @author Lavindar
 *
 */
public enum FrenchValue {
    JOKER(PropertiesEnum.CARD_FRENCH_VALUE_JOKER, PropertiesEnum.CARD_FRENCH_SYMBOL_JOKER, 0),
    ACE(PropertiesEnum.CARD_FRENCH_VALUE_ACE, PropertiesEnum.CARD_FRENCH_SYMBOL_ACE, 1),
    TWO(PropertiesEnum.CARD_FRENCH_VALUE_TWO, PropertiesEnum.CARD_FRENCH_SYMBOL_TWO, 2),
    THREE(PropertiesEnum.CARD_FRENCH_VALUE_THREE, PropertiesEnum.CARD_FRENCH_SYMBOL_THREE, 3),
    FOUR(PropertiesEnum.CARD_FRENCH_VALUE_FOUR, PropertiesEnum.CARD_FRENCH_SYMBOL_FOUR, 4),
    FIVE(PropertiesEnum.CARD_FRENCH_VALUE_FIVE, PropertiesEnum.CARD_FRENCH_SYMBOL_FIVE, 5),
    SIX(PropertiesEnum.CARD_FRENCH_VALUE_SIX, PropertiesEnum.CARD_FRENCH_SYMBOL_SIX, 6),
    SEVEN(PropertiesEnum.CARD_FRENCH_VALUE_SEVEN, PropertiesEnum.CARD_FRENCH_SYMBOL_SEVEN, 7),
    EIGHT(PropertiesEnum.CARD_FRENCH_VALUE_EIGHT, PropertiesEnum.CARD_FRENCH_SYMBOL_EIGHT, 8),
    NINE(PropertiesEnum.CARD_FRENCH_VALUE_NINE, PropertiesEnum.CARD_FRENCH_SYMBOL_NINE, 9),
    TEN(PropertiesEnum.CARD_FRENCH_VALUE_TEN, PropertiesEnum.CARD_FRENCH_SYMBOL_TEN, 10),
    JACK(PropertiesEnum.CARD_FRENCH_VALUE_JACK, PropertiesEnum.CARD_FRENCH_SYMBOL_JACK, 11),
    QUEEN(PropertiesEnum.CARD_FRENCH_VALUE_QUEEN, PropertiesEnum.CARD_FRENCH_SYMBOL_QUEEN, 12),
    KING(PropertiesEnum.CARD_FRENCH_VALUE_KING, PropertiesEnum.CARD_FRENCH_SYMBOL_KING, 13);
    
    private final PropertiesEnum name;
    private final PropertiesEnum symbol;
    private final int value;
    
    /**
     * @param name
     * @param symbol
     * @param value
     */
    private FrenchValue(PropertiesEnum name, PropertiesEnum symbol, int value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return NameProvider.getName(name.getKey());
    }
    /**
     * @return the symbol
     */
    public String getSymbol() {
        return NameProvider.getName(symbol.getKey());
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
    public String toString(){
        return getName();
    }
    
}
