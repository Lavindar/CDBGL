package br.com.cdbgl.core.card.decks.german;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum GermanValue {
    SIX(PropertiesEnum.CARD_GERMAN_VALUE_SIX, PropertiesEnum.CARD_GERMAN_SYMBOL_SIX, 6),
    SEVEN(PropertiesEnum.CARD_GERMAN_VALUE_SEVEN, PropertiesEnum.CARD_GERMAN_SYMBOL_SEVEN, 6),
    EIGHT(PropertiesEnum.CARD_GERMAN_VALUE_EIGHT, PropertiesEnum.CARD_GERMAN_SYMBOL_EIGHT, 8),
    NINE(PropertiesEnum.CARD_GERMAN_VALUE_NINE, PropertiesEnum.CARD_GERMAN_SYMBOL_NINE, 9),
    TEN(PropertiesEnum.CARD_GERMAN_VALUE_TEN, PropertiesEnum.CARD_GERMAN_SYMBOL_TEN, 10),
    JACK(PropertiesEnum.CARD_GERMAN_VALUE_JACK, PropertiesEnum.CARD_GERMAN_SYMBOL_JACK, 11),
    QUEEN(PropertiesEnum.CARD_GERMAN_VALUE_QUEEN, PropertiesEnum.CARD_GERMAN_SYMBOL_QUEEN, 12),
    KING(PropertiesEnum.CARD_GERMAN_VALUE_KING, PropertiesEnum.CARD_GERMAN_SYMBOL_KING, 13),
    ACE(PropertiesEnum.CARD_GERMAN_VALUE_KING, PropertiesEnum.CARD_GERMAN_SYMBOL_ACE, 14);
    
    private final PropertiesEnum name;
    private final PropertiesEnum symbol;
    private final int value;
    
    private GermanValue(PropertiesEnum name, PropertiesEnum symbol, int value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }

    public String getName() {
        return NameProvider.getName(name.getKey());
    }

    public String getSymbom() {
        return NameProvider.getName(symbol.getKey());
    }

    public int getValue() {
        return value;
    }
    
    public String toString(){
        return getName();
    }
}
