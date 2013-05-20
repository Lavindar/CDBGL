package br.com.cdbgl.core.card.decks.hanafuda;

public enum HanafudaFlower {
    PINE("Pine", 1),
    PLUM_BLOSSOM("Plum Blossom", 2),
    CHERRY_BLOSSOM("Cherry Blossom", 3),
    WISTERIA("Wisteria", 4),
    IRIS("Iris", 5),
    PEONY("Peony", 6),
    BUSH_CLOVER("Bush Clover", 7),
    PAMPAS("Pampas", 8),
    CHRYSANTHEMUM("Chrysanthemum", 9),
    MAPLE("Maple", 10),
    WILLOW("Willow", 11),
    PAULOWNIA("Paulownia", 12);
    
    private final String name;
    private final int monthNumber;

    private HanafudaFlower(String name, int monthNumber) {
        this.name = name;
        this.monthNumber = monthNumber;
    }

    public String getName() {
        return name;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
    
    public String toString(){
        return name;
    }
}
