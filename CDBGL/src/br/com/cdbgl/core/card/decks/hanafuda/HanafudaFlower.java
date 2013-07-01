package br.com.cdbgl.core.card.decks.hanafuda;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

public enum HanafudaFlower {
    PINE(PropertiesEnum.CARD_HANAFUDA_FLOWER_PINE, 1),
    PLUM_BLOSSOM(PropertiesEnum.CARD_HANAFUDA_FLOWER_PLUM_BLOSSOM, 2),
    CHERRY_BLOSSOM(PropertiesEnum.CARD_HANAFUDA_FLOWER_CHERRY_BLOSSOM, 3),
    WISTERIA(PropertiesEnum.CARD_HANAFUDA_FLOWER_WISTERIA, 4),
    IRIS(PropertiesEnum.CARD_HANAFUDA_FLOWER_IRIS, 5),
    PEONY(PropertiesEnum.CARD_HANAFUDA_FLOWER_PEONY, 6),
    BUSH_CLOVER(PropertiesEnum.CARD_HANAFUDA_FLOWER_BUSH_CLOVER, 7),
    PAMPAS(PropertiesEnum.CARD_HANAFUDA_FLOWER_PAMPAS, 8),
    CHRYSANTHEMUM(PropertiesEnum.CARD_HANAFUDA_FLOWER_CHRYSANTHEMUM, 9),
    MAPLE(PropertiesEnum.CARD_HANAFUDA_FLOWER_MAPLE, 10),
    WILLOW(PropertiesEnum.CARD_HANAFUDA_FLOWER_WILLOW, 11),
    PAULOWNIA(PropertiesEnum.CARD_HANAFUDA_FLOWER_PAULOWNIA, 12);
    
    private final PropertiesEnum name;
    private final int monthNumber;

    private HanafudaFlower(PropertiesEnum name, int monthNumber) {
        this.name = name;
        this.monthNumber = monthNumber;
    }

    public String getName() {
        return NameProvider.getName(name.getKey());
    }

    public int getMonthNumber() {
        return monthNumber;
    }
    
    public String toString(){
        return getName();
    }
}
