/**
 * 
 */
package br.com.cdbgl.core.die.numeric;

import java.util.Random;

import br.com.cdbgl.core.die.Die;

/**
 * @author Lavindar
 *
 */
public class NumericDie implements Die<NumericFace> {
    
    private final Random random;
    private final NumericFace[] faces;
    private final int numberOfFaces;
    private NumericFace actualFace;

    public NumericDie(Random random, NumericFace... faces){
        this.faces = faces;
        this.random = random;
        this.numberOfFaces = faces.length;
        roll();
    }
    
    public NumericDie(NumericFace... faces){
        this(new Random(), faces);
    }
    
    public static NumericDie createDie(int numberOfFaces, int starterValue, int valueRange){
        NumericFace faces[] = new NumericFace[numberOfFaces];
        
        int value = starterValue;
        
        for(int i = 0; i < numberOfFaces; i++){
            faces[i] = new NumericFace(value);
            value += valueRange;
        }
        
        return new NumericDie(faces);
    }
    
    @Override
    public int getNumberOfFace() {
        return numberOfFaces;
    }

    @Override
    public NumericFace getActualFace() {
        return actualFace;
    }

    @Override
    public NumericFace roll() {
        actualFace = faces[random.nextInt(numberOfFaces)];
        return actualFace;
    }

}
