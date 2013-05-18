/**
 * 
 */
package br.com.cdbgl.core.card.decks.spanish;

/**
 * @author Lavindar
 *
 */
public enum SpanishValue {
    ONE("One", "1", 1),
    TWO("Two", "2", 2),
    THREE("Three", "3", 3),
    FOUR("Four", "4", 4),
    FIVE("Five", "5", 5),
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 7),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    KNAVE("Knave", "10", 10),
    KNIGHT("Knight", "11", 11),
    KING("King", "12", 12);    
    
    private final String name;
    private final String symbol;
    private final int value;
    
    private SpanishValue(String name, String symbol, int value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public int getValue() {
        return value;
    }
    
    public String toString(){
        return name;
    }
}
