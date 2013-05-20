/**
 * 
 */
package br.com.cdbgl.core.board.grid;

import br.com.cdbgl.core.board.Board;

/**
 * @author Lavindar
 *
 */
public interface GridBoard<TILE extends GridTile<?>, POSITION extends GridPosition> extends Board {
    
    public TILE getTile(POSITION position);

}
