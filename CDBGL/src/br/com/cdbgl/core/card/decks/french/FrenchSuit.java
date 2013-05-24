/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

import java.awt.Color;

import br.com.cdbgl.core.localization.NameProvider;
import br.com.cdbgl.core.localization.PropertiesEnum;

/**
 * @author Lavindar
 *
 */
public enum FrenchSuit {
    SPADES(PropertiesEnum.CARD_FRENCH_SUIT_SPADES, 1, Color.BLACK),
    HEARTS(PropertiesEnum.CARD_FRENCH_SUIT_HEARTS, 2, Color.RED),
    DIAMONDS(PropertiesEnum.CARD_FRENCH_SUIT_DIAMONDS, 3, Color.RED),
    CLUBS(PropertiesEnum.CARD_FRENCH_SUIT_CLUBS, 4, Color.BLACK);
    
    private final PropertiesEnum name;
    private final int rank;
    private final Color color;
    
    /**
     * @param name
     * @param rank
     * @param color
     */
    private FrenchSuit(PropertiesEnum name, int rank, Color color) {
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
