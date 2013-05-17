/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

/**
 * @author Lavindar
 *
 */
public enum FrenchValue {
    WILD("Joker", "JOKER", 0),
    ACE("Ace", "A", 1),
    TWO("Two", "2", 2),
    TRHEE("Three", "2", 3),
    FOUR("Four", "4", 4),
    FIVE("Five", "5", 5),
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 7),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    TEN("Ten", "10", 10),
    JACK("Jack", "J", 11),
    QUEEN("Queen", "Q", 12),
    KING("King", "K", 13);
    
    private final String name;
    private final String symbol;
    private final int value;
    
    /**
     * @param name
     * @param symbol
     * @param value
     */
    private FrenchValue(String name, String symbol, int value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
    
}
