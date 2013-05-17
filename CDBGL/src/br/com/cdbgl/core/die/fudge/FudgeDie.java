/**
 * 
 */
package br.com.cdbgl.core.die.fudge;

import java.util.Random;

import br.com.cdbgl.core.die.Die;

/**
 * @author Lavindar
 *
 */
public class FudgeDie implements Die<FudgeFace> {
    private final Random random;
    private final FudgeFace faces[] = {
            new FudgeFace(FudgeEnum.MINUS),
            new FudgeFace(FudgeEnum.BLANK),
            new FudgeFace(FudgeEnum.PLUS),
            new FudgeFace(FudgeEnum.MINUS),
            new FudgeFace(FudgeEnum.BLANK),
            new FudgeFace(FudgeEnum.PLUS)            
    };
    private final int numberOfFaces = 6;
    private FudgeFace actualFace;

    public FudgeDie(){
        this(new Random());
    }
    
    public FudgeDie(Random random){
        this.random = random;
        roll();
    }
    
    @Override
    public int getNumberOfFace() {
        return numberOfFaces;
    }

    @Override
    public FudgeFace getActualFace() {
        return actualFace;
    }

    public FudgeFace roll() {
        actualFace = faces[random.nextInt(numberOfFaces)];
        return actualFace;
    }

}
