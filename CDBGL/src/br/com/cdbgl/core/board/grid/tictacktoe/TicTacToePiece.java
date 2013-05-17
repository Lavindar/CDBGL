/**
 * 
 */
package br.com.cdbgl.core.board.grid.tictacktoe;

import br.com.cdbgl.core.board.grid.GridPiece;

/**
 * @author Lavindar
 *
 */
public enum TicTacToePiece implements GridPiece {
    CROSSES(0, "O"),
    NOUGHTS(1, "X");
    
    private final int value;
    private final String symbol;
    
    private TicTacToePiece(int value, String symbol){
        this.value = value;
        this.symbol = symbol;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    

}
