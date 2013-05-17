/**
 * 
 */
package br.com.cdbgl.core.die.numeric;

import br.com.cdbgl.core.die.DieFace;

/**
 * @author Lavindar
 *
 */
public class NumericFace implements DieFace<Integer> {
    
    private int value;
    
    public NumericFace(int value){
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
