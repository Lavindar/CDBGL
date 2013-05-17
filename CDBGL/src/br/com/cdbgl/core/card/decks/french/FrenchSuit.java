/**
 * 
 */
package br.com.cdbgl.core.card.decks.french;

/**
 * @author Lavindar
 *
 */
public enum FrenchSuit {
    SPADES("Spades", 1),
    HEARTS("Hearts", 2),
    DIAMONDS("Diamonds", 3),
    CLUBS("Clubs", 4);
    
    private final String name;
    private final int rank;
    
    /**
     * @param name
     * @param rank
     */
    private FrenchSuit(String name, int rank) {
        this.name = name;
        this.rank = rank;
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
}
