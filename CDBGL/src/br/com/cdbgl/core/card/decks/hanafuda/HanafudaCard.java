package br.com.cdbgl.core.card.decks.hanafuda;

import br.com.cdbgl.core.card.Card;

public enum HanafudaCard implements Card<HanafudaType, HanafudaFlower> {
    PINE_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PINE),
    PINE_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PINE),
    PINE_POETRY_RIBBON(HanafudaType.POETRY_RIBBON, HanafudaFlower.PINE),
    PINE_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.PINE),
    PLUM_BLOSSOM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_POETRY_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHERRY_BLOSSOM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHERRY_BLOSSOM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHERRY_BLOSSOM_POETRY_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHERRY_BLOSSOM_BRIGHT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WISTERIA_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WISTERIA_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WISTERIA_RED_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WISTERIA_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    IRIS_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    IRIS_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    IRIS_RED_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    IRIS_OBJECT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PEONY_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PEONY_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PEONY_BLUE_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PEONY_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    BUSH_CLOVER_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    BUSH_CLOVER_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    BUSH_CLOVER_RED_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    BUSH_CLOVER_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAMPAS_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAMPAS_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAMPAS_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAMPAS_BRIGHT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHRYSANTHEMUM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHRYSANTHEMUM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHRYSANTHEMUM_BLUE_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    CHRYSANTHEMUM_OBJECT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    MAPLE_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    MAPLE_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    MAPLE_RED_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    MAPLE_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WILLOW_RED_RIBBON(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WILLOW_LIGHTNING(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WILLOW_ANIMAL(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    WILLOW_BRIGHT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAULOWNIA_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAULOWNIA_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAULOWNIA_PLAIN_SHADED(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PAULOWNIA_BRIGHT(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM);
    
    private final HanafudaType type;
    private final HanafudaFlower flower;
    
    
    private HanafudaCard(HanafudaType type, HanafudaFlower flower) {
        this.type = type;
        this.flower = flower;
    }

    @Override
    public HanafudaType getValue() {
        return type;
    }

    @Override
    public HanafudaFlower getSuit() {
        return flower;
    }
    
}
