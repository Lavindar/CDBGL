package br.com.cdbgl.core.card.decks.hanafuda;

public enum HanafudaFlower {
    MATSU("Matsu", 1),
    UME("Ume", 2),
    SAKURA("Sakura", 3),
    FUJI("Fuji", 4),
    AYAME("Ayame", 5),
    BOTAN("Botan", 6),
    HAGI("Hagi", 7),
    SUSUKI("Susuki", 8),
    KIKU("Kiku", 9),
    MOMIJI("Momiji", 10),
    YANAGI("Yanagi", 11),
    KIRI("Kiri", 12);
    
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
