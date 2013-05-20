package br.com.cdbgl.game.tictactoe;

import br.com.cdbgl.core.board.grid.GridPosition;

public enum TicTacToePosition implements GridPosition{
    NORTH(1 , 0),
    NORTHEAST(2, 0),
    EAST(2, 1),
    SOUTHEAST(2, 2),
    SOUTH(1, 2),
    SOUTHWEST(0, 2),
    WEST(0, 1),
    NORTHWEST(0, 0),
    CENTER(1, 1);
    
    private final int x;
    private final int y;
    
    private TicTacToePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
