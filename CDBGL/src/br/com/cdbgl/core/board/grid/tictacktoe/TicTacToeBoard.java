/**
 * 
 */
package br.com.cdbgl.core.board.grid.tictacktoe;

import br.com.cdbgl.core.board.grid.GridBoard;

/**
 * @author Lavindar
 *
 */
public class TicTacToeBoard implements GridBoard<TicTacToeTile> {
    private final TicTacToeTile tiles[][] = {
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()},
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()},
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()}
    };

    @Override
    public TicTacToeTile getTile(int x, int y) {
        return tiles[x][y];
    }
    
    public TicTacToePiece getPiece(int x, int y){
        return tiles[x][y].getPiece();
    }
    
    public boolean setPiece(int x, int y, TicTacToePiece piece){
        return tiles[x][y].setPiece(piece);
    }

}
