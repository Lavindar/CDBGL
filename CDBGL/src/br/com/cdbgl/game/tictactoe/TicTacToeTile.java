/**
 * 
 */
package br.com.cdbgl.game.tictactoe;

import br.com.cdbgl.core.board.grid.GridTile;

/**
 * @author Lavindar
 *
 */
public class TicTacToeTile implements GridTile<TicTacToePiece> {

    private TicTacToePiece piece;
    
    public TicTacToeTile(){
        
    }
    
    @Override
    public boolean setPiece(TicTacToePiece piece) {
        if(isEmpty()){
            this.piece = piece;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public TicTacToePiece getPiece() {
        return piece;
    }

    @Override
    public boolean isEmpty() {
        return (piece == null);
    }

    @Override
    public TicTacToePiece removePiece() {
        TicTacToePiece removedPiece = piece;
        piece = null;
        return removedPiece;
    }

}
