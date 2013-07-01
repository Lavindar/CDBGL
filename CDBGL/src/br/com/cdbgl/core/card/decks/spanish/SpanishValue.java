/**
 * 
 */
package br.com.cdbgl.core.card.decks.spanish;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

/**
 * @author Lavindar
 *
 */
public enum SpanishValue {
    ONE(PropertiesEnum.CARD_SPANISH_VALUE_ONE, PropertiesEnum.CARD_SPANISH_SYMBOL_ONE, 1),
    TWO(PropertiesEnum.CARD_SPANISH_VALUE_TWO, PropertiesEnum.CARD_SPANISH_SYMBOL_TWO, 2),
    THREE(PropertiesEnum.CARD_SPANISH_VALUE_THREE, PropertiesEnum.CARD_SPANISH_SYMBOL_THREE, 3),
    FOUR(PropertiesEnum.CARD_SPANISH_VALUE_FOUR, PropertiesEnum.CARD_SPANISH_SYMBOL_FOUR, 4),
    FIVE(PropertiesEnum.CARD_SPANISH_VALUE_FIVE, PropertiesEnum.CARD_SPANISH_SYMBOL_FIVE, 5),
    SIX(PropertiesEnum.CARD_SPANISH_VALUE_SIX, PropertiesEnum.CARD_SPANISH_SYMBOL_SIX, 6),
    SEVEN(PropertiesEnum.CARD_SPANISH_VALUE_SEVEN, PropertiesEnum.CARD_SPANISH_SYMBOL_SEVEN, 7),
    EIGHT(PropertiesEnum.CARD_SPANISH_VALUE_EIGHT, PropertiesEnum.CARD_SPANISH_SYMBOL_EIGHT, 8),
    NINE(PropertiesEnum.CARD_SPANISH_VALUE_NINE, PropertiesEnum.CARD_SPANISH_SYMBOL_NINE, 9),
    KNAVE(PropertiesEnum.CARD_SPANISH_VALUE_KNAVE, PropertiesEnum.CARD_SPANISH_SYMBOL_KNAVE, 10),
    KNIGHT(PropertiesEnum.CARD_SPANISH_VALUE_KNIGHT, PropertiesEnum.CARD_SPANISH_SYMBOL_KNIGHT, 11),
    KING(PropertiesEnum.CARD_SPANISH_VALUE_KING, PropertiesEnum.CARD_SPANISH_SYMBOL_KING, 12);    
    
    private final PropertiesEnum name;
    private final PropertiesEnum symbol;
    private final int value;
    
    private SpanishValue(PropertiesEnum name, PropertiesEnum symbol, int value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }
    
    public String getName() {
        return NameProvider.getName(name.getKey());
    }
    
    public String getSymbol() {
        return NameProvider.getName(symbol.getKey());
    }
    
    public int getValue() {
        return value;
    }
    
    public String toString(){
        return getName();
    }
}
