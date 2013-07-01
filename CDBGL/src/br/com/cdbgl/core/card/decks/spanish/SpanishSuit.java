package br.com.cdbgl.core.card.decks.spanish;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum SpanishSuit {
    CLUBS(PropertiesEnum.CARD_SPANISH_SUIT_CLUBS, 1),
    CUPS(PropertiesEnum.CARD_SPANISH_SUIT_CUPS, 2),
    SWORDS(PropertiesEnum.CARD_SPANISH_SUIT_SWORDS, 3),
    GOLDS(PropertiesEnum.CARD_SPANISH_SUIT_GOLDS, 4);
    
    private final PropertiesEnum name;
    private final int rank;
    
    private SpanishSuit(PropertiesEnum name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return NameProvider.getName(name.getKey());
    }

    public int getRank() {
        return rank;
    }
    
    public String toString(){
        return getName();
    }
}
