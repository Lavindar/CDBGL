package br.com.cdbgl.core.card.decks.german;

public enum GermanValue {
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 6),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    TEN("Ten", "10", 10),
    JACK("Jack", "J", 11),
    QUEEN("Queen", "Q", 12),
    KING("King", "K", 13),
    ACE("Ace", "A", 14);
    
    private final String name;
    private final String symbom;
    private final int value;
    
    private GermanValue(String name, String symbom, int value) {
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
