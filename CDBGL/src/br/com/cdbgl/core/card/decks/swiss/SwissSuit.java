package br.com.cdbgl.core.card.decks.swiss;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum SwissSuit {
    BELLS(PropertiesEnum.CARD_SWISS_SUIT_BELLS),
    SHIELDS(PropertiesEnum.CARD_SWISS_SUIT_SHIELDS),
    ROSES(PropertiesEnum.CARD_SWISS_SUIT_ROSES),
    ACORNS(PropertiesEnum.CARD_SWISS_SUIT_ACORNS);

    private final PropertiesEnum name;

    private SwissSuit(PropertiesEnum name) {
        this.name = name;
    }

    public String getName() {
        return NameProvider.getName(name.getKey());
    }
    
    public String toString(){
        return getName();
    }
    
}
