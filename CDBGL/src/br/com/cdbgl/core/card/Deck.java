/**
 * 
 */
package br.com.cdbgl.core.card;

/**
 * @author Lavindar
 *
 */
public interface Deck<CARD_TYPE extends Card<?, ?>> {
    
    public CARD_TYPE pickTopCard();

    public CARD_TYPE lookTopCard();
    
    public CARD_TYPE pickBottonCard();
    
    public CARD_TYPE lookBottonCard();
    
    public void registerShuffler(DeckShuffler shuffler);
    
    public void shuffle();

}
