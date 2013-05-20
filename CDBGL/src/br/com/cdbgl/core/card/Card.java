/**
 * 
 */
package br.com.cdbgl.core.card;

/**
 * @author Lavindar
 *
 */
public interface Card<VALUE, SUIT> {

    public VALUE getValue();
    
    public SUIT getSuit();
}
