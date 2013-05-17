/**
 * 
 */
package br.com.cdbgl.core.board.grid;

import br.com.cdbgl.core.board.Tile;

/**
 * @author Lavindar
 *
 */
public interface GridTile<PIECE extends GridPiece> extends Tile {
    
    public PIECE getPiece();
    
    public boolean setPiece(PIECE piece);
    
    public PIECE removePiece();
    
    public boolean isEmpty();

}
