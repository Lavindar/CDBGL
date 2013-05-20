package br.com.cdbgl.core.card.decks.hanafuda;

import br.com.cdbgl.core.card.Card;

public enum HanafudaCard implements Card<HanafudaType, HanafudaFlower> {
    PINE_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PINE),
    PINE_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PINE),
    PINE_POETRY_RIBBON(HanafudaType.POETRY_RIBBON, HanafudaFlower.PINE),
    PINE_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.PINE),
    
    PLUM_BLOSSOM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_POETRY_RIBBON(HanafudaType.POETRY_RIBBON, HanafudaFlower.PLUM_BLOSSOM),
    PLUM_BLOSSOM_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.PLUM_BLOSSOM),
    
    CHERRY_BLOSSOM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.CHERRY_BLOSSOM),
    CHERRY_BLOSSOM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.CHERRY_BLOSSOM),
    CHERRY_BLOSSOM_POETRY_RIBBON(HanafudaType.POETRY_RIBBON, HanafudaFlower.CHERRY_BLOSSOM),
    CHERRY_BLOSSOM_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.CHERRY_BLOSSOM),
    
    WISTERIA_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.WISTERIA),
    WISTERIA_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.WISTERIA),
    WISTERIA_RED_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.WISTERIA),
    WISTERIA_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.WISTERIA),
    
    IRIS_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.IRIS),
    IRIS_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.IRIS),
    IRIS_RED_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.IRIS),
    IRIS_OBJECT(HanafudaType.OBJECT, HanafudaFlower.IRIS),
    
    PEONY_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PEONY),
    PEONY_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PEONY),
    PEONY_BLUE_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.PEONY),
    PEONY_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.PEONY),
    
    BUSH_CLOVER_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.BUSH_CLOVER),
    BUSH_CLOVER_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.BUSH_CLOVER),
    BUSH_CLOVER_RED_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.BUSH_CLOVER),
    BUSH_CLOVER_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.BUSH_CLOVER),
    
    PAMPAS_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PAMPAS),
    PAMPAS_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PAMPAS),
    PAMPAS_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.PAMPAS),
    PAMPAS_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.PAMPAS),
    
    CHRYSANTHEMUM_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.CHRYSANTHEMUM),
    CHRYSANTHEMUM_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.CHRYSANTHEMUM),
    CHRYSANTHEMUM_BLUE_RIBBON(HanafudaType.BLUE_RIBBON, HanafudaFlower.CHRYSANTHEMUM),
    CHRYSANTHEMUM_OBJECT(HanafudaType.OBJECT, HanafudaFlower.CHRYSANTHEMUM),
    
    MAPLE_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.MAPLE),
    MAPLE_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.MAPLE),
    MAPLE_RED_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.MAPLE),
    MAPLE_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.MAPLE),
    
    WILLOW_RED_RIBBON(HanafudaType.RED_RIBBON, HanafudaFlower.WILLOW),
    WILLOW_LIGHTNING(HanafudaType.LIGHTNING, HanafudaFlower.WILLOW),
    WILLOW_ANIMAL(HanafudaType.ANIMAL, HanafudaFlower.WILLOW),
    WILLOW_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.WILLOW),
    
    PAULOWNIA_PLAIN_A(HanafudaType.PLAIN, HanafudaFlower.PAULOWNIA),
    PAULOWNIA_PLAIN_B(HanafudaType.PLAIN, HanafudaFlower.PAULOWNIA),
    PAULOWNIA_PLAIN_SHADED(HanafudaType.PLAIN, HanafudaFlower.PAULOWNIA),
    PAULOWNIA_BRIGHT(HanafudaType.BRIGHT, HanafudaFlower.PAULOWNIA);
    
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
