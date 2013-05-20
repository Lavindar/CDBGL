/**
 * 
 */
package br.com.cdbgl.game.tictactoe;

import br.com.cdbgl.core.board.grid.GridBoard;

/**
 * @author Lavindar
 *
 */
public class TicTacToeBoard implements GridBoard<TicTacToeTile, TicTacToePosition> {
    private final TicTacToeTile tiles[][] = {
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()},
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()},
            {new TicTacToeTile(), new TicTacToeTile(), new TicTacToeTile()}
    };

    @Override
    public TicTacToeTile getTile(TicTacToePosition position) {
        return tiles[position.getX()][position.getY()];
    }
    
    public TicTacToePiece getPiece(TicTacToePosition position){
        return tiles[position.getX()][position.getY()].getPiece();
    }
    
    public boolean setPiece(TicTacToePosition position, TicTacToePiece piece){
        return tiles[position.getX()][position.getY()].setPiece(piece);
    }

}
