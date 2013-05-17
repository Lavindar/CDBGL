/**
 * 
 */
package br.com.cdbgl.core.die.fudge;

/**
 * @author Lavindar
 *
 */
public enum FudgeEnum {
    PLUS(1),
    BLANK(0),
    MINUS(-1);
    
    private final int modifier;
    
    private FudgeEnum(int modifier){
        this.modifier = modifier;
    }
    
    public int getModifier(){
        return modifier;
    }
    

}
