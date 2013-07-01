package br.com.cdbgl.core.card.decks.hanafuda;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum HanafudaType {
    PLAIN(PropertiesEnum.CARD_HANAFUDA_TYPE_PLAIN, 1),
    LIGHTNING(PropertiesEnum.CARD_HANAFUDA_TYPE_LIGHTNING, 1),
    RED_RIBBON(PropertiesEnum.CARD_HANAFUDA_TYPE_RED_RIBBON, 5),
    BLUE_RIBBON(PropertiesEnum.CARD_HANAFUDA_TYPE_BLUE_RIBBON, 5),
    POETRY_RIBBON(PropertiesEnum.CARD_HANAFUDA_TYPE_POETRY_RIBBON, 5),
    ANIMAL(PropertiesEnum.CARD_HANAFUDA_TYPE_ANIMAL, 10),
    OBJECT(PropertiesEnum.CARD_HANAFUDA_TYPE_OBJECT, 10),
    BRIGHT(PropertiesEnum.CARD_HANAFUDA_TYPE_BRIGHT, 20);
    
    private final PropertiesEnum name;
    private final int value;

    private HanafudaType(PropertiesEnum name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public String getName(){
        return NameProvider.getName(name.getKey());
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
}
