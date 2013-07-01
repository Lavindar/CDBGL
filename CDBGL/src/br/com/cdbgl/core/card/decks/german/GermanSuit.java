/**
 * 
 */
package br.com.cdbgl.core.card.decks.german;

import java.awt.Color;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

/**
 * @author Lavindar
 *
 */
public enum GermanSuit {
    HEARTS(PropertiesEnum.CARD_GERMAN_SUIT_HEARTS, 1, Color.RED),
    DIAMONDS(PropertiesEnum.CARD_GERMAN_SUIT_DIAMONDS, 2, Color.YELLOW),
    SPADES(PropertiesEnum.CARD_GERMAN_SUIT_SPADES, 3, Color.GREEN),
    CLUBS(PropertiesEnum.CARD_GERMAN_SUIT_CLUBS, 4, Color.BLACK);
    
    private final PropertiesEnum name;
    private final int rank;
    private final Color color;
    
    /**
     * @param name
     * @param rank
     * @param color
     */
    private GermanSuit(PropertiesEnum name, int rank, Color color) {
        this.name = name;
        this.rank = rank;
        this.color = color;
    }

    /**
     * @return the name
     */
    public String getName() {
        return NameProvider.getName(name.getKey());
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
        return getName();
    }
}
