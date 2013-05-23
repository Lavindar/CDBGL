/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import java.awt.Color;

import br.com.cdbgl.core.NameProvider;

/**
 * @author Lavindar
 *
 */
public enum FrenchSuit {
    SPADES(NameProvider.getName("card.french.suit.spades"), 1, Color.BLACK),
    HEARTS(NameProvider.getName("card.french.suit.hearts"), 2, Color.RED),
    DIAMONDS(NameProvider.getName("card.french.suit.diamonds"), 3, Color.RED),
    CLUBS(NameProvider.getName("card.french.suit.clubs"), 4, Color.BLACK);
    
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
