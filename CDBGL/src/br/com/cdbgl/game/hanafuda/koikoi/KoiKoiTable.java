package br.com.cdbgl.game.hanafuda.koikoi;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.cdbgl.core.card.decks.hanafuda.HanafudaCard;

public class KoiKoiTable {
    public static void main(String[] args) {
        KoiKoiDeck deck = new KoiKoiDeck(new ArrayList<HanafudaCard>(Arrays.asList(HanafudaCard.values())));
        
        deck.shuffle();
        
        for(int i = 0; i < deck.getNumberOfCards(); i++){
            System.out.println(deck.pickTopCard());
        }
    }
}
