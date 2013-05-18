package br.com.cdbgl.core.card.decks.swiss;

public enum SwissSuit {
    BELLS("Bells"),
    SHIELDS("Shields"),
    ROSES("Shields"),
    ACORNS("Acorns");

    private final String name;

    private SwissSuit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return name;
    }
    
}
