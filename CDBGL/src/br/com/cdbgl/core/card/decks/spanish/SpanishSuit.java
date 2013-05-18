package br.com.cdbgl.core.card.decks.spanish;

public enum SpanishSuit {
    CLUBS("Clubs", 1),
    CUPS("Cups", 2),
    SWORDS("Swords", 3),
    GOLDS("Golds", 4);
    
    private final String name;
    private final int rank;
    
    private SpanishSuit(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
    
    public String toString(){
        return name;
    }
}
