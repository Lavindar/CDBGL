/**
 * 
 */
package br.com.cdbgl.core.card.decks.german;

import java.awt.Color;

/**
 * @author Lavindar
 *
 */
public enum GermanSuit {
    HEARTS("Hearts", 1, Color.RED),
    DIAMONDS("Diamonds", 2, Color.YELLOW),
    SPADES("Spades", 3, Color.GREEN),
    CLUBS("Clubs", 4, Color.BLACK);
    
    private final String name;
    private final int rank;
    private final Color color;
    
    /**
     * @param name
     * @param rank
     * @param color
     */
    private GermanSuit(String name, int rank, Color color) {
        this.name = name;
        this.rank = rank;
        this.color = color;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }
    
    /**
     * @return the color
     */
    public Color getColor(){
        return color;
    }
    
    public String toString(){
        return name;
    }
}
