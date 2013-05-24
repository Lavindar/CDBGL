package br.com.cdbgl.core.localization;

public enum PropertiesEnum {
    CARD_FRENCH_SUIT_SPADES("card.french.suit.spades", "Spades"),
    CARD_FRENCH_SUIT_HEARTS("card.french.suit.hearts", "Hearts"),
    CARD_FRENCH_SUIT_DIAMONDS("card.french.suit.diamonds", "Diamonds"),
    CARD_FRENCH_SUIT_CLUBS("card.french.suit.clubs", "Clubs"),
    CARD_FRENCH_VALUE_JOKER("card.french.value.joker", "Joker"),
    CARD_FRENCH_VALUE_ACE("card.french.value.ace", "Ace"),
    CARD_FRENCH_VALUE_TWO("card.french.value.two", "Two"),
    CARD_FRENCH_VALUE_THREE("card.french.value.three", "Three"),
    CARD_FRENCH_VALUE_FOUR("card.french.value.four", "Four"),
    CARD_FRENCH_VALUE_FIVE("card.french.value.five", "Five"),
    CARD_FRENCH_VALUE_SIX("card.french.value.six", "Six"),
    CARD_FRENCH_VALUE_SEVEN("card.french.value.seven", "Seven"),
    CARD_FRENCH_VALUE_EIGHT("card.french.value.eight", "Eight"),
    CARD_FRENCH_VALUE_NINE("card.french.value.nine", "Nine"),
    CARD_FRENCH_VALUE_TEN("card.french.value.ten", "Ten"),
    CARD_FRENCH_VALUE_JACK("card.french.value.jack", "Jack"),
    CARD_FRENCH_VALUE_QUEEN("card.french.value.queen", "Queen"),
    CARD_FRENCH_VALUE_KING("card.french.value.king", "King"),
    CARD_FRENCH_SYMBOL_JOKER("card.french.symbol.joker", "JOKER"),
    CARD_FRENCH_SYMBOL_ACE("card.french.symbol.ace", "A"),
    CARD_FRENCH_SYMBOL_TWO("card.french.symbol.two", "2"),
    CARD_FRENCH_SYMBOL_THREE("card.french.symbol.three", "3"),
    CARD_FRENCH_SYMBOL_FOUR("card.french.symbol.four", "4"),
    CARD_FRENCH_SYMBOL_FIVE("card.french.symbol.five", "5"),
    CARD_FRENCH_SYMBOL_SIX("card.french.symbol.six", "6"),
    CARD_FRENCH_SYMBOL_SEVEN("card.french.symbol.seven", "7"),
    CARD_FRENCH_SYMBOL_EIGHT("card.french.symbol.eight", "8"),
    CARD_FRENCH_SYMBOL_NINE("card.french.symbol.nine", "9"),
    CARD_FRENCH_SYMBOL_TEN("card.french.symbol.ten", "10"),
    CARD_FRENCH_SYMBOL_JACK("card.french.symbol.jack", "J"),
    CARD_FRENCH_SYMBOL_QUEEN("card.french.symbol.queen", "Q"),
    CARD_FRENCH_SYMBOL_KING("card.french.symbol.king", "K"),
    CARD_FRENCH_SEPARATOR("card.french.separator","[VALUE] of [SUIT]"),
    CARD_GERMAN_SUIT_HEARTS("card.german.suit.hearts","Hearts");
    
    private final String key;
    private final String defaultValue;
    
    private PropertiesEnum(String key, String defaultValue){
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }
}
