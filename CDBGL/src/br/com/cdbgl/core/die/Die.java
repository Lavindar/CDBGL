/**
 * 
 */
package br.com.cdbgl.core.die;

/**
 * @author Lavindar
 *
 */
public interface Die<FACE_VALUE extends DieFace<?>> {
    
    public int getNumberOfFace();
    
    public FACE_VALUE getActualFace();
    
    public FACE_VALUE roll();
    
}
