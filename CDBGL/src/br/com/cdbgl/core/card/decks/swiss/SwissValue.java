package br.com.cdbgl.core.card.decks.swiss;

public enum SwissValue {
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 6),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    BANNER("Banner", "B", 10),
    UNDER("Under", "U", 11),
    TOP("Top", "T", 12),
    KING("King", "K", 13),
    ACE("Ace", "A", 14);
    
    private final String name;
    private final String symbol;
    private final int value;
    
    private SwissValue(String name, String symbom, int value) {
        this.name = name;
        this.symbol = symbom;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSymbom() {
        return symbol;
    }

    public int getValue() {
        return value;
    }
    
    public String toString(){
        return name;
    }
}
