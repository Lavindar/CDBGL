/**
 * 
 */
package br.com.cdbgl.core.die.fudge;

import br.com.cdbgl.core.die.DieFace;

/**
 * @author Lavindar
 *
 */
public class FudgeFace implements DieFace<FudgeEnum> {
    
    private final FudgeEnum value;

    public FudgeFace(FudgeEnum value){
        this.value = value;
    }
    
    @Override
    public FudgeEnum getValue() {
        return value;
    }

}
