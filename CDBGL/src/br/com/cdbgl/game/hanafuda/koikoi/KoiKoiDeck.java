package br.com.cdbgl.game.hanafuda.koikoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cdbgl.core.card.Card;
import br.com.cdbgl.core.card.Deck;
import br.com.cdbgl.core.card.DeckShuffler;
import br.com.cdbgl.core.card.decks.hanafuda.HanafudaCard;

public class KoiKoiDeck implements Deck<HanafudaCard> {
    private DeckShuffler shuffler;
    private int numberOfCards;
    private ArrayList<HanafudaCard> cards;
    
    private static final DeckShuffler defaultShuffler = new DeckShuffler() {
        @Override
        public void shuffle(List<? extends Card<?, ?>> cardList) {
            Collections.shuffle(cardList);
        }
    };
    
    public KoiKoiDeck(){
        this(new ArrayList<HanafudaCard>(), defaultShuffler);
    }
    
    public KoiKoiDeck(ArrayList<HanafudaCard> cards){
        this(cards, defaultShuffler);
    }
    
    public KoiKoiDeck(DeckShuffler shuffler){
        this(new ArrayList<HanafudaCard>(), shuffler);
    }
    
    public KoiKoiDeck(ArrayList<HanafudaCard> cards, DeckShuffler shuffler){
        this.cards = cards;
        numberOfCards = this.cards.size(); 
        this.shuffler = shuffler;
    }
    
    @Override
    public HanafudaCard pickTopCard() {
        HanafudaCard topCard = cards.get(numberOfCards - 1);
        cards.remove(numberOfCards - 1);
        numberOfCards = this.cards.size(); 
        return topCard;
    }

    @Override
    public HanafudaCard lookTopCard() {
        return cards.get(numberOfCards - 1);
    }

    @Override
    public HanafudaCard pickBottonCard() {
        HanafudaCard bottonCard = cards.get(0);
        cards.remove(0);
        numberOfCards = this.cards.size(); 
        return bottonCard;
    }

    @Override
    public HanafudaCard lookBottonCard() {
        return cards.get(0);
    }
    
    @Override
    public int getNumberOfCards(){
        return numberOfCards;
    }

    @Override
    public void registerShuffler(DeckShuffler shuffler) {
        this.shuffler = shuffler;
    }

    @Override
    public void unregisterShuffler() {
        shuffler = defaultShuffler;
    }
    
    @Override
    public void shuffle() {
        shuffler.shuffle(cards);
    }
}
