/**
 * 
 */
package br.com.cdbgl.game.tictactoe;

import br.com.cdbgl.core.board.grid.GridPiece;

/**
 * @author Lavindar
 *
 */
public enum TicTacToePiece implements GridPiece {
    NOUGHTS("Noughts", 0, "O"),
    CROSSES("Crosses", 1, "X");
    
    private final String name;
    private final int value;
    private final String symbol;
    
    private TicTacToePiece(String name, int value, String symbol){
        this.name = name;
        this.value = value;
        this.symbol = symbol;
    }
    
    public String getName(){
        return name;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public String toString(){
        return name;
    }

}
