/**
 * 
 */
package br.com.cdbgl.core.card;

import java.util.List;

/**
 * @author Lavindar
 *
 */
public interface DeckShuffler {
    public void shuffle(List<? extends Card<?, ?>> cardList);
}
