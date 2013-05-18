package br.com.cdbgl.core.card.decks.swiss;

public enum SwissValue {
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 6),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    BANNER("Banner", "B", 10),
    UDER("Uder", "U", 11),
    OBER("Ober", "O", 12),
    KONIG("König", "K", 13),
    AS("As", "A", 14);
    
    private final String name;
    private final String symbom;
    private final int value;
    
    private SwissValue(String name, String symbom, int value) {
        this.name = name;
        this.symbom = symbom;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSymbom() {
        return symbom;
    }

    public int getValue() {
        return value;
    }
    
    public String toString(){
        return name;
    }
}
