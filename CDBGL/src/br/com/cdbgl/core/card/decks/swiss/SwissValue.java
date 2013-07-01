package br.com.cdbgl.core.card.decks.swiss;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum SwissValue {
    SIX(PropertiesEnum.CARD_SWISS_VALUE_SIX, PropertiesEnum.CARD_SWISS_SYMBOL_SIX, 6),
    SEVEN(PropertiesEnum.CARD_SWISS_VALUE_SEVEN, PropertiesEnum.CARD_SWISS_SYMBOL_SEVEN, 6),
    EIGHT(PropertiesEnum.CARD_SWISS_VALUE_EIGHT, PropertiesEnum.CARD_SWISS_SYMBOL_EIGHT, 8),
    NINE(PropertiesEnum.CARD_SWISS_VALUE_NINE, PropertiesEnum.CARD_SWISS_SYMBOL_NINE, 9),
    BANNER(PropertiesEnum.CARD_SWISS_VALUE_BANNER, PropertiesEnum.CARD_SWISS_SYMBOL_BANNER, 10),
    UNDER(PropertiesEnum.CARD_SWISS_VALUE_UNDER, PropertiesEnum.CARD_SWISS_SYMBOL_UNDER, 11),
    TOP(PropertiesEnum.CARD_SWISS_VALUE_TOP, PropertiesEnum.CARD_SWISS_SYMBOL_TOP, 12),
    KING(PropertiesEnum.CARD_SWISS_VALUE_KING, PropertiesEnum.CARD_SWISS_SYMBOL_KING, 13),
    ACE(PropertiesEnum.CARD_SWISS_VALUE_ACE, PropertiesEnum.CARD_SWISS_SYMBOL_ACE, 14);
    
    private final PropertiesEnum name;
    private final PropertiesEnum symbol;
    private final int value;
    
    private SwissValue(PropertiesEnum name, PropertiesEnum symbom, int value) {
        this.name = name;
        this.symbol = symbom;
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
