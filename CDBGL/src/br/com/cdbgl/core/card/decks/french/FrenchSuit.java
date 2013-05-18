/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import java.awt.Color;

/**
 * @author Lavindar
 *
 */
public enum FrenchSuit {
    SPADES("Spades", 1, Color.BLACK),
    HEARTS("Hearts", 2, Color.RED),
    DIAMONDS("Diamonds", 3, Color.RED),
    CLUBS("Clubs", 4, Color.BLACK);
    
    private final String name;
    private final int rank;
    private final Color color;
    
    /**
     * @param name
     * @param rank
     * @param color
     */
    private FrenchSuit(String name, int rank, Color color) {
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
