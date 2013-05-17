/**
 * 
 */
package br.com.cdbgl.core.board.grid;

import br.com.cdbgl.core.board.Board;

/**
 * @author Lavindar
 *
 */
public interface GridBoard<TILE extends GridTile<?>> extends Board {
    
    public TILE getTile(int x, int y);

}
