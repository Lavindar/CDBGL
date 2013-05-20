package br.com.cdbgl.core.card.decks.hanafuda;

public enum HanafudaType {
    PLAIN("Plain", 1),
    LIGHTNING("Lightning", 1),
    RED_RIBBON("Red Ribbon", 5),
    BLUE_RIBBON("Blue Ribbon", 5),
    POETRY_RIBBON("Poetry Ribbon", 5),
    ANIMAL("Animal", 10),
    OBJECT("Object", 10),
    BRIGHT("Bright", 20);
    
    private final String name;
    private final int value;

    private HanafudaType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
