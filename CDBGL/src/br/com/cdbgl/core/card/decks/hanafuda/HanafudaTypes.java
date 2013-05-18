package br.com.cdbgl.core.card.decks.hanafuda;

public enum HanafudaTypes {
    PLAIN(1),
    RED_RIBBON(5),
    BLUE_RIBBON(5),
    POETRY_RIBBON(5),
    ANIMAL(10);
    
    private final int value;

    private HanafudaTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    
    
    
}
